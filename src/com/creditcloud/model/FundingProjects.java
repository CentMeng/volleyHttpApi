package com.creditcloud.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 众筹列表摘要（各10条记录）
 * @author mengxc
 *
 */
public class FundingProjects {

    /**
     * 开放众筹项目
     */
	public List<FundingProjectExt> open = new ArrayList<FundingProjectExt>();
	
	/**
	 * 待发布众筹项目
	 */
	public List<FundingProjectExt> scheduled = new ArrayList<FundingProjectExt>();
	
	/**
	 * 已满标众筹项目
	 */
	public List<FundingProjectExt> finished = new ArrayList<FundingProjectExt>();
	
	/**
	 * 已结算众筹项目
	 */
	public List<FundingProjectExt> settiled = new ArrayList<FundingProjectExt>();
	
}
