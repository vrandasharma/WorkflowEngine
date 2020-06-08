package com.workflow_runner.sales_workflow.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WorkflowLoggingDTO {
	private Integer request_key;
	private String status;
	private Integer step_key;
	private Integer operation_key;
    private String summary;
}
