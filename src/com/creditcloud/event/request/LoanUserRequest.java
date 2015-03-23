package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取借款用户信息
 * 
 * @author mengxc
 *
 */
public class LoanUserRequest extends ApiRequest {

	public LoanUserRequest(String loanId) {
		super(String.format(ApiConstants.API_LOAN_USER, loanId));
	}
}
