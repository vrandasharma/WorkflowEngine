package com.workflow_runner.sales_workflow.service;

import com.workflow_runner.sales_workflow.dto.WorkflowLoggingDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRequestMetaDataDTO;

public interface IWorkflowRequestHandler {
	
    WorkflowRequestDTO createWorkflowRawRequest(WorkflowRequestMetaDataDTO wfrawRequest);

    WorkflowLoggingDTO updateWorkflowRequestStatus(WorkflowRequestMetaDataDTO wfRequest);
}
