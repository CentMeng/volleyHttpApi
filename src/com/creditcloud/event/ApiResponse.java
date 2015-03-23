package com.creditcloud.event;

import android.text.TextUtils;

import com.creditcloud.model.ApiError;
import com.creditcloud.model.ErrorInfo;

public class ApiResponse {

	 /**
     * 返回具体数据
     */
    private Object date;
    
    private boolean success;
    
    /**
     * 错误列表
     */
    private ApiError error;
    
    private boolean  needToLogin = false;

	public Object getDate() {
		return date;
	}

	public void setDate(Object date) {
		this.date = date;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ApiError getError() {
		return error;
	}

	public void setError(ApiError error) {
		this.error = error;
	}

	public boolean isNeedToLogin() {
		return needToLogin;
	}

	public void setNeedToLogin(boolean needToLogin) {
		this.needToLogin = needToLogin;
	}
	public boolean isError(){
    	return !TextUtils.isEmpty(error.getMessage());
    }
    
    public String getErrorMessage(){
    	
    		return ErrorInfo.getMsg(error.getMessage());
    	}
    
}
