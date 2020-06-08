package com.workflow_runner.sales_workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WorkflowRawRequestDTO {
	private Integer id;
    private WorkflowRequestMetaDataDTO metaData;
	public WorkflowRequestMetaDataDTO getMetaData() {
		return metaData;
	}
	public void setMetaData(WorkflowRequestMetaDataDTO metaData) {
		this.metaData = metaData;
	}

}
