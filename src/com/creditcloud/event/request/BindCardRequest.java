package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 三方账号绑卡
 * 
 * @author mengxc
 *
 */
public class BindCardRequest extends ApiRequest {

	public BindCardRequest(String cardId) {
		super(ApiConstants.API_BINDCARD);
		params.put("cardId", cardId);
	}
	
}

