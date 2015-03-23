package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 汇付绑卡请求
 * 
 * @author mengxc
 *
 */
public class PnrBindCardRequest extends ApiRequest {

	public PnrBindCardRequest(String userId) {
		super(ApiConstants.API_BINDCARD);
		
		params.put("userId", userId);
	}
	
}

