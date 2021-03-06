package com.creditcloud.model.enums;

/**
 * 资金操作
 * 
 * @author mengxc (mengxc.ma@creditcloud.com)
 * 
 *         创建时间：2014-3-17 上午11:39:13
 * 
 */
public enum Operation implements BaseEnum {

	IN("资金转入"),
	OUT("资金转出");
	
	private final String key;

	private Operation(String key) {
		this.key = key;
	}

	@Override
	public String getKey() {
		return key;
	}
}
