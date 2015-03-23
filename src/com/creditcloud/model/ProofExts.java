package com.creditcloud.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 认证信息列表
 * 
 * Created by mengxc on 14-3-4.
 */
public class ProofExts implements Serializable {
	
    private static final long serialVersionUID = -4857220860179605265L;
    
    /**
     * 认证图片列表
     */
    public List<ProofExt> IMAGE;
	
}
