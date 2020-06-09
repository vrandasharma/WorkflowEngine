package com.workflow_runner.sales_workflow.controller;

import com.workflow_runner.sales_workflow.dto.WorkflowLoggingDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRequestMetaDataDTO;
import com.workflow_runner.sales_workflow.service.IWorkflowRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/wf-request", produces = MediaType.APPLICATION_JSON_VALUE)
public class WorkflowRawRequestController {

    @Autowired
    private IWorkflowRequestHandler workflowRawRequestService;

    @PutMapping(value = "/create-wf-request")
    public ResponseEntity<WorkflowRequestDTO> createWorkflowRawRequest(@RequestBody WorkflowRequestMetaDataDTO wfRawRequest) {
        WorkflowRequestDTO response = workflowRawRequestService.createWorkflowRawRequest(wfRawRequest);
        return new ResponseEntity<WorkflowRequestDTO>(response, HttpStatus.OK);
    }
    
    @PostMapping(value = "/update-wf-request")
    public ResponseEntity<WorkflowLoggingDTO> updateWorkflowRequestStatus(@RequestBody WorkflowRequestMetaDataDTO wfRawRequest) {
        WorkflowLoggingDTO response = workflowRawRequestService.updateWorkflowRequestStatus(wfRawRequest);
        return new ResponseEntity<WorkflowLoggingDTO>(response, HttpStatus.OK);
    }

}
