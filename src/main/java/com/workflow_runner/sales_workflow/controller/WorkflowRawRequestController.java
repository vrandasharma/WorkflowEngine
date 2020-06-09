package com.workflow_runner.sales_workflow.controller;

import com.workflow_runner.sales_workflow.dto.WorkflowLoggingDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRawRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowRequestMetaDataDTO;
import com.workflow_runner.sales_workflow.service.IWorkflowRawRequestHandler;
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
@RequestMapping(value = "/wf-raw-request", produces = MediaType.APPLICATION_JSON_VALUE)
public class WorkflowRawRequestController {

    @Autowired
    private IWorkflowRawRequestHandler workflowRawRequestService;

    @PutMapping(value = "/create-wf-raw-request")
    public ResponseEntity<WorkflowRawRequestDTO> createWorkflowRawRequest(@RequestBody WorkflowRequestMetaDataDTO wfRawRequest) {
        WorkflowRawRequestDTO response = workflowRawRequestService.createWorkflowRawRequest(wfRawRequest);
        return new ResponseEntity<WorkflowRawRequestDTO>(response, HttpStatus.OK);
    }
    
    @PostMapping(value = "/update-wf-request-status")
    public ResponseEntity<WorkflowLoggingDTO> updateWorkflowRequestStatus(@RequestBody WorkflowRequestMetaDataDTO wfRawRequest) {
        WorkflowLoggingDTO response = workflowRawRequestService.updateWorkflowRequestStatus(wfRawRequest);
        return new ResponseEntity<WorkflowLoggingDTO>(response, HttpStatus.OK);
    }

}
