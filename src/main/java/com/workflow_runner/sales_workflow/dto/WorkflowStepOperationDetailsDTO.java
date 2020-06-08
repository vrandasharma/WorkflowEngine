package com.workflow_runner.sales_workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
 public class WorkflowStepOperationDetailsDTO {
	private Integer operationId;
	private Integer stepKey;
	private String  productCode;
	private String  commandCode;
	private String  commanAction;
	private OperationConfigurationDTO operationConfiguration;
	
	public String getCommanAction() {
		return commanAction;
	}
	public void setCommanAction(String commanAction) {
		this.commanAction = commanAction;
	}
	public String getCommandCode() {
		return commandCode;
	}
	public void setCommandCode(String commandCode) {
		this.commandCode = commandCode;
	}
}
