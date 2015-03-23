package com.creditcloud.model;

import java.io.Serializable;
import java.util.List;

/**
 * 众筹项目详情
 * @author mengxc
 *
 */
public class FundingProjectDetail implements Serializable {

	private static final long serialVersionUID = -7654909865081866178L;

	/**
	 * 众筹图片信息
	 */
	public List<ProofExt> projectImage;
	
	/**
	 * 众筹首页大图
	 */
	public ProofExt bannerImage;
	
	/**
	 * 众筹预览图
	 */
	public ProofExt preImage;
	
	/**
	 * 众筹项目信息
	 */
	public FundingProjectExt ext;
}
