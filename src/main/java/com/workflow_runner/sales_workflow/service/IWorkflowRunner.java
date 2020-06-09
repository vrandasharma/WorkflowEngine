package com.workflow_runner.sales_workflow.service;

import com.workflow_runner.sales_workflow.dto.WorkflowRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowStepsInfoDTO;

public interface IWorkflowRunner {

	void executeWorkflowSteps(WorkflowRequestDTO wfrawRequestModel);
}
