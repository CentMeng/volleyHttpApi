package com.creditcloud.event;

import java.util.List;

import android.text.TextUtils;

import com.creditcloud.model.ApiError;
import com.creditcloud.model.ErrorInfo;

public class ApiResponse{

	
    
    private boolean success;
    
    /**
     * 错误列表
     */
    private List<ApiError> error;
    
    private boolean  needToLogin = false;
   

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
    
	
	
	public List<ApiError> getError() {
		return error;
	}

	public void setError(List<ApiError> error) {
		this.error = error;
	}

	public boolean isNeedToLogin() {
		return needToLogin;
	}

	public void setNeedToLogin(boolean needToLogin) {
		this.needToLogin = needToLogin;
	}
	public boolean isError(){
		if(error != null && error.size()>0){
    	return !TextUtils.isEmpty(error.get(0).getMessage());
		}else{
			return false;
		}
    }
    
    public String getErrorMessage(){
    	
    		return ErrorInfo.getMsg(error.get(0).getMessage());
    	}
    
}
