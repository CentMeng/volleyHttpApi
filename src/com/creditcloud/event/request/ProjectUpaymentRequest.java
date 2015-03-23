package com.creditcloud.event.request;

import android.util.Log;

import com.android.volley.Request.Method;
import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

/**
 * 对众筹项目进行投资
 * 
 * @author mengxc
 *
 */
public class ProjectUpaymentRequest extends ApiRequest {

	public ProjectUpaymentRequest(String projectId, String orderId) {
		super(ApiConstants.API_UPAYMENT_PROJECT_TENDER);
		
		Log.e("project", getUrl(Method.GET));
		params.put("projectId", projectId);
		params.put("investId", orderId);
	}

}
