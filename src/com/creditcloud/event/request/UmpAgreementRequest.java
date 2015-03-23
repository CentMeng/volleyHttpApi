package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 获取用户签署的联动协议
 * @author mengxc
 *
 */
public class UmpAgreementRequest extends ApiRequest {

	public UmpAgreementRequest() {
		super(ApiConstants.API_MY_AGREEMENT);
	}
	
}
