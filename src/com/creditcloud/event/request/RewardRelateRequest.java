package com.creditcloud.event.request;

import com.creditcloud.api.ApiConstants;
import com.creditcloud.event.ApiRequest;

public class RewardRelateRequest extends ApiRequest {

	public RewardRelateRequest(String rewardId) {
		super(ApiConstants.API_REWARD_RELATE);
		params.put("rewardId", rewardId);
	}
	
}

