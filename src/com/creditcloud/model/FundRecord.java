package com.creditcloud.model;

import java.io.Serializable;

/**
 * 
 * 资金记录
 * 
 * @author mengxc (mengxc.ma@creditcloud.com)
 * 
 */
public class FundRecord implements Serializable {

    private static final long serialVersionUID = -1336828583233718186L;
    
    /**
     * 金额
     */
    public double amount;
    
    /**
     * 描述
     */
	public String description;

	/**
	 * 资金记录关联实体
	 */
	public Entity entity;

	/**
	 * 资金记录ID
	 */
	public String id;

	/**
	 * 
	 */
	@Deprecated
	public String method;

	/**
	 * 资金操作
	 */
	public String operation;

	/**
	 * 资金记录关联编号
	 */
	public String orderId;

	@Deprecated
	public String orderNumber;

	@Deprecated
	public long recordTime;

	/**
	 * 资金状态
	 */
	public String status;

	/**
	 * 创建时间
	 */
	public long timeRecorded;

	/**
	 * 类型
	 */
	public String type;

	/**
	 * 用户ID
	 */
	public String userId;
}
