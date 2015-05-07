package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 请求交易账号信息
 * @author mengxc
 *
 */
public class FundAccountRequest extends ApiRequest{

	public FundAccountRequest(String values) {
		super(String.format(ApiConstants.API_MY_FUND_ACCOUNT,values));
	}
	
}
