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
@NoArgsConstructor
public class WorkflowRequestMetaDataDTO {
	
    private String productCode;
    private String from;
    private String subjectContent;
    private String bodyContent;
    private List<String> attachments = new ArrayList();
    
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
