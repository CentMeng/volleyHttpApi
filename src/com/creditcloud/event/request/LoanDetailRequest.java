package com.creditcloud.event.request;

import android.content.Context;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 
 * 借款标的详情信息
 * 
 * @author mengxc
 *
 */
public class LoanDetailRequest extends ApiRequest {

	public LoanDetailRequest(Context ctx,String loanId) {
		super(String.format(ApiConstants.API_LOAN_DETAIL, loanId));
	}
}
