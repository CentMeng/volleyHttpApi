package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 借款标的的投资记录
 * 
 * @author mengxc
 *
 */
public class LoanInvestsRequest extends ApiRequest {

	public LoanInvestsRequest(String loanId) {
		super(String.format(ApiConstants.API_LOAN_INVESTS, loanId));
	}
	
}



