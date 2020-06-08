package com.workflow_runner.sales_workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WorkflowStepsInfoDTO {
	

	private String productCode;
	private String productClientCode;
	private String productConfiguration;
	private Integer id;
	private List<WorkflowStepDetailsDTO> executionStepsInfo = new ArrayList<>();
	
	public List<WorkflowStepDetailsDTO> getExecutionStepsInfo() {
		return executionStepsInfo;
	}
	public void setExecutionStepsInfo(List<WorkflowStepDetailsDTO> executionStepsInfo) {
		this.executionStepsInfo = executionStepsInfo;
	}
}
