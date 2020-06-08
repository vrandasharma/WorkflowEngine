package com.workflow_runner.sales_workflow.service;

import com.workflow_runner.sales_workflow.dto.WorkflowRawRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowStepOperationDetailsDTO;

public interface IWorkflowCommandRunner {

	 boolean executeCommand(WorkflowStepOperationDetailsDTO workflowOperation, 
			 WorkflowRawRequestDTO wfRequest);

}
