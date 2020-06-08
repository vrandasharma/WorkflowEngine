package com.workflow_runner.sales_workflow.repo;

import com.workflow_runner.sales_workflow.dto.WorkflowStepsInfoDTO;
import com.workflow_runner.sales_workflow.entity.WorkflowProductCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by vranda on 08/06/20.
 */
public interface IWorkflowProductCatalogRepo extends JpaRepository<WorkflowProductCatalog, Integer> {

    @Query("select new WorkflowProductCatalog(wfb.id)  from workflow_product_catalog wfb")
    WorkflowStepsInfoDTO fetchStepDtoByProductCode(String productKey);
}
