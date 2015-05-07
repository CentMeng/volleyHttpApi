package com.creditcloud.event.response;

import java.util.List;

import com.creditcloud.event.ApiResponse;
import com.creditcloud.model.Banner;

public class BannerResponse extends ApiResponse{
	
	private List<Banner> banner;

	public List<Banner> getBanner() {
		return banner;
	}

	public void setBanner(List<Banner> banner) {
		this.banner = banner;
	}
	
	

}
