package com.workflow_runner.sales_workflow.repo;

import com.workflow_runner.sales_workflow.dto.WorkflowStepsInfoDTO;
import com.workflow_runner.sales_workflow.entity.WorkflowProductCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IWorkflowProductCatalogRepo extends JpaRepository<WorkflowProductCatalog, Integer> {
 
	// TBD : Call standard procedure to fetch master data and populate WorkflowStepsInfoDTO
    @Query("select new WorkflowProductCatalog(wfb.id)  from workflow_product_catalog wfb")
    WorkflowStepsInfoDTO fetchStepDtoByProductCode(String productKey);
}
