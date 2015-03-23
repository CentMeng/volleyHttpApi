package com.creditcloud.model;

import java.io.Serializable;
import java.util.List;

/**
 * 资金记录列表
 * 
 * @author mengxc
 *
 */
public class FundRecords implements Serializable {

    private static final long serialVersionUID = 1179606580862611250L;
    
    /**
     * 当前资金列表
     */
    public List<FundRecord> results;
    
    /**
     * 资金记录总数
     */
	public int totalSize;
}
