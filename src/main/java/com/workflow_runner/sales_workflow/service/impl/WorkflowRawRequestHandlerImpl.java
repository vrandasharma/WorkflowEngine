package com.workflow_runner.sales_workflow.service.impl;
import com.workflow_runner.sales_workflow.service.IWorkflowRawRequestHandler;
import com.workflow_runner.sales_workflow.service.IWorkflowRunnerInterface;
import org.springframework.beans.factory.annotation.Autowired;

import com.workflow_runner.sales_workflow.constants.Enumerator.CREATE_STATUS;
import com.workflow_runner.sales_workflow.dto.WorkflowRawRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRequestMetaDataDTO;
import org.springframework.stereotype.Component;

@Component
public class WorkflowRawRequestHandlerImpl implements IWorkflowRawRequestHandler {
	
	@Autowired
	private IWorkflowRunnerInterface worflowRunnerService;

	public WorkflowRawRequestDTO createWorkflowRawRequest(WorkflowRequestMetaDataDTO wfrawRequest) {
		 // TBD : write logic to create an entry in database table WF_RAW_PRODUCT_CATALOG and populate DTO
		WorkflowRawRequestDTO wfRequest = new WorkflowRawRequestDTO();
		// Start Workflow Run 
		this.initiateWorkflowRun(wfRequest);
		return null;

	}
	
	public void initiateWorkflowRun(WorkflowRawRequestDTO wfrawRequestModel) {
		try {
			worflowRunnerService.executeWorkflowSteps(wfrawRequestModel);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
	}

}
