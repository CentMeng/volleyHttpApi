package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 投标（联动）
 * @author mengxc
 *
 */
public class UpaymentRequest extends ApiRequest {

    /**
     * 
     * @param loanId 标的ID
     * @param amount 投资金额
     */
	public UpaymentRequest(String loanId, int amount) {
		super(ApiConstants.API_UPAYMENT_TENDER);
		params.put("loanId", loanId);
		params.put("amount", amount);
	}

}
