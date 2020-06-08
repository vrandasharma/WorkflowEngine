package com.workflow_runner.sales_workflow.service;

import com.workflow_runner.sales_workflow.dto.WorkflowRawRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRequestMetaDataDTO;

/**
 * Created by vranda on 08/06/20.
 */
public interface IWorkflowRawRequestHandler {
    WorkflowRawRequestDTO createWorkflowRawRequest(WorkflowRequestMetaDataDTO wfrawRequest);
}
