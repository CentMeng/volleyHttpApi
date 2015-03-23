package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;
import com.creditcloud.model.enums.LoanPurpose;

/**
 * 获取借款标的列表(待发布、开放投标、已满标的、已结算各10条记录)
 * 
 * @author mengxc
 *
 */
public class LoansSummaryRequest extends ApiRequest {

	public LoanPurpose purpose;
	
	public LoansSummaryRequest() {
		super(ApiConstants.API_LOANS_SUMMARY);
	}
	
	public LoansSummaryRequest(LoanPurpose purpose) {
		super(String.format(ApiConstants.API_LOANS_SUMMARY_PURPOSE, purpose.name()));
		this.purpose = purpose;
	}
}

