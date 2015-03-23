package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 无密投标（联动）
 * @author mengxc
 *
 */
public class TenderNoPwdRequest extends ApiRequest {

	public TenderNoPwdRequest(String loanId, int amount) {
		super(String.format(ApiConstants.API_UPAYMENT_NO_PWD, loanId, amount));
	}

}
