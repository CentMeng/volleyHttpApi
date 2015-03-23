package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 企业用户信息
 * 
 * @author mengxc
 *
 */
public class CorporationRequest extends ApiRequest {

	public CorporationRequest(String corpationId) {
		super(String.format(ApiConstants.API_CORPORATION, corpationId));
	}
}
