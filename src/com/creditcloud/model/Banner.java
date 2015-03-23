package com.creditcloud.model;

import java.io.Serializable;

/** 
 * @author mengxc ( csdn@vip.163.com )
 * 
 * 2014-10-15 上午10:07:08 
 * 
 */
public class Banner implements Serializable {

	private static final long serialVersionUID = -34929625207018920L;

	/**
	 * 
	 */
	public String id;
	
	public String channelId;
	
	/**
	 * 文章标题
	 */
	public String title;
	
	/**
	 * 文章内容
	 */
	public String content;
	
	/**
	 * 文章所属栏目
	 */
	public String category;
	
	/**
	 * 
	 */
	public String hasImage;
	public String priority;
	public String newsId;
	
	/**
	 * 相关链接地址
	 */
	public String url;
	
	public String pubDate;
	public String media;
	
	/**
	 * 作者
	 */
	public String author;
	
	/**
	 * 编辑时间
	 */
	public String timeRecorded;
	
	public String previous;
	public String next;
	public String parent;
	public String bgColor;
	
}
