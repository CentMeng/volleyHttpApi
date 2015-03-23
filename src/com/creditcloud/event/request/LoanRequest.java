package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 借款标的的基本信息
 * 
 * @author mengxc
 *
 */
public class LoanRequest extends ApiRequest {

	public LoanRequest(String loanId) {
		super(String.format(ApiConstants.API_LOAN, loanId));
	}
}
