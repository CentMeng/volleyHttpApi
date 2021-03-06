package com.creditcloud.model.enums;

/**
 * 
 * 众筹分类
 * 
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-10 上午10:39:00
 * 
 */
public enum ProjectCategory implements BaseEnum {

	OTHER("其他", true),
	/**
	 * FENG
	 */
	FENG_SF("梦想首发", false), FENG_CZ("梦想创造", false);

	private final String key;

	/**
	 * 是否通用
	 */
	private final boolean general;

	private ProjectCategory(String key, boolean general) {
		this.key = key;
		this.general = general;
	}

	@Override
	public String getKey() {
		return key;
	}

	public boolean isGeneral() {
		return general;
	}
}
