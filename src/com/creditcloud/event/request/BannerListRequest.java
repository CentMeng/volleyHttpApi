package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 
 * 首页轮播图
 * 
 * @author mengxc
 *
 */
public class BannerListRequest extends ApiRequest {

	public BannerListRequest() {
		super(ApiConstants.API_BANNERS);
	}
	
}

