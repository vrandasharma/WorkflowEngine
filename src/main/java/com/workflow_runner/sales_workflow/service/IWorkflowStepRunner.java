package com.workflow_runner.sales_workflow.service;

import com.workflow_runner.sales_workflow.dto.WorkflowRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowStepDetailsDTO;

public interface IWorkflowStepRunner {
	
	public Boolean executeStep(WorkflowStepDetailsDTO step_info, WorkflowRequestDTO wfrawRequestModel);
	
}
