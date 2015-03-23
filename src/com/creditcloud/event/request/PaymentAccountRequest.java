package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取第三方资金账户信息
 * @author mengxc
 *
 */
public class PaymentAccountRequest extends ApiRequest {

	public PaymentAccountRequest() {
		super(ApiConstants.API_MY_PAYMENT_ACCOUNT);
	}
	
}
