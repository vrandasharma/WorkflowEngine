package com.workflow_runner.sales_workflow.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.workflow_runner.sales_workflow.dto.WorkflowRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowStepDetailsDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowStepOperationDetailsDTO;
import com.workflow_runner.sales_workflow.service.IWorkflowCommandRunner;
import com.workflow_runner.sales_workflow.service.IWorkflowStepRunner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class WorkflowStepRunnerImpl implements IWorkflowStepRunner {

	@Autowired
	private IWorkflowCommandRunner workflowCommandRunner;
	
	@Autowired
	private WorkflowEventAndSummaryLoggingImpl workflowLogger;

	@Autowired
	@Qualifier("commonThreadPool")
	private ExecutorService commonThreadPool;

	@Override
	public Boolean executeStep(WorkflowStepDetailsDTO stepInfo, WorkflowRequestDTO wfRequest) {
		try {
			//TBD Create an entry in WF_SUMMARY table against request key
			//workflowCommandRunner.wfRequest = this.wfRequest;
			List<CompletableFuture> subtasks = new ArrayList<>();
			for(WorkflowStepOperationDetailsDTO stepOperation : stepInfo.getStepOperations()) {
				subtasks.add(CompletableFuture.supplyAsync(()->{
					try{
						return workflowCommandRunner.executeCommand(stepOperation, wfRequest);
					} catch (Exception e){
						throw new CompletionException(e);
					}
				}, commonThreadPool));
			}
			Boolean result = true;
			for(CompletableFuture<Boolean> status :  subtasks){
				result&= status.get(10000, TimeUnit.MILLISECONDS);
			}
			return result;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}	
	}

}
