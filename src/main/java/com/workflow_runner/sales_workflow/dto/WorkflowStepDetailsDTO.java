package com.workflow_runner.sales_workflow.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor

public class WorkflowStepDetailsDTO {

	private Integer stepKey;
	private String  productCode;
	private StepConfgurationDTO stepConfiguration;
	private List<WorkflowStepOperationDetailsDTO> stepOperations = new ArrayList<>();
	
	public List<WorkflowStepOperationDetailsDTO> getStepOperations() {
		return stepOperations;
	}
	public void setStepOperations(List<WorkflowStepOperationDetailsDTO> stepOperations) {
		this.stepOperations = stepOperations;
	}
}
