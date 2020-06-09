package com.workflow_runner.sales_workflow.service;

import com.workflow_runner.sales_workflow.dto.WorkflowLoggingDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRawRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRequestMetaDataDTO;

public interface IWorkflowRawRequestHandler {
	
    WorkflowRawRequestDTO createWorkflowRawRequest(WorkflowRequestMetaDataDTO wfrawRequest);

    WorkflowLoggingDTO updateWorkflowRequestStatus(WorkflowRequestMetaDataDTO wfRequest);
}
