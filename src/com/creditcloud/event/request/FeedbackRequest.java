package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 提交意见反馈信息
 * 
 * @author mengxc
 *
 */
public class FeedbackRequest extends ApiRequest {
	
	public FeedbackRequest(String content, String contact) {
		super(ApiConstants.API_FEEDBACK);
		
		params.put("contact",contact);
		params.put("feedback",content);
	}
}
