package com.workflow_runner.sales_workflow.service.impl;

import com.workflow_runner.sales_workflow.dto.WorkflowRequestDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowStepDetailsDTO;
import com.workflow_runner.sales_workflow.dto.WorkflowStepsInfoDTO;
import com.workflow_runner.sales_workflow.repo.IWorkflowProductCatalogRepo;
import com.workflow_runner.sales_workflow.service.IWorkflowRunner;
import com.workflow_runner.sales_workflow.service.IWorkflowStepRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkflowRequestRunnerImpl implements IWorkflowRunner {
    @Autowired
    private IWorkflowStepRunner workflowStepRunnerService;

    @Autowired
    private WorkflowEventAndSummaryLoggingImpl workflowLogger;

    @Autowired
    private IWorkflowProductCatalogRepo workflowProductCatalogRepo;

    @Override
    public void executeWorkflowSteps(WorkflowRequestDTO wfrawRequestModel) {
        try {
            WorkflowStepsInfoDTO stepsInfoDTO = workflowProductCatalogRepo.fetchStepDtoByProductCode(wfrawRequestModel.getMetaData().getProductCode());

            for (WorkflowStepDetailsDTO step : stepsInfoDTO.getExecutionStepsInfo()) {
                if (!(workflowStepRunnerService.executeStep(step, wfrawRequestModel))) {
                    // TBD : Update summary for workflow and run cascade step
                    // workflow_logging_servie.logWorkflowStepExecutionDetails();
                } else {
                    continue;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
