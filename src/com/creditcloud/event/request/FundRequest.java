package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 
 * 用户企业资金信息统计
 * 
 * @author mengxc
 *
 */
public class FundRequest extends ApiRequest {

	public FundRequest() {
		super(ApiConstants.API_MY_FUND);
	}
	
}
