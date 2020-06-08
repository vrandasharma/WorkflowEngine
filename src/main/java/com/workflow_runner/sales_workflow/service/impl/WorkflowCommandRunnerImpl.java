package com.workflow_runner.sales_workflow.service.impl;

import org.springframework.stereotype.Service;

import com.workflow_runner.sales_workflow.dto.WorkflowRawRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowStepOperationDetailsDTO;
import com.workflow_runner.sales_workflow.enums.CommandActions;
import com.workflow_runner.sales_workflow.service.IWorkflowCommandRunner;

@Service
public class WorkflowCommandRunnerImpl implements IWorkflowCommandRunner {

	@Override
	public boolean executeCommand(WorkflowStepOperationDetailsDTO workflowOperation, WorkflowRawRequestDTO wfRequest) {
		// TODO Auto-generated method stub
		switch(workflowOperation.getCommanAction()) {
		//case CommandActions.INIT:
			// TBD : write individual implementation of each action  as per enum CommandActions
		}
		return false;
	}

}
