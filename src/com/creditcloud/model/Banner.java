package com.creditcloud.model;

import java.io.Serializable;

/**
 * @author mengxc ( csdn@vip.163.com )
 * 
 *         2014-10-15 上午10:07:08
 * 
 */
public class Banner implements Serializable {

	private static final long serialVersionUID = -34929625207018920L;

	/**
	 * 
	 */
	private String id;

	private String channelId;

	/**
	 * 文章标题
	 */
	private String title;

	/**
	 * 文章内容
	 */
	private String content;

	/**
	 * 文章所属栏目
	 */
	private String category;

	/**
	 * 
	 */
	private String hasImage;
	private String priority;
	private String newsId;

	/**
	 * 相关链接地址
	 */
	private String url;

	private String pubDate;
	private String media;

	/**
	 * 作者
	 */
	private String author;

	/**
	 * 编辑时间
	 */
	private String timeRecorded;

	private String previous;
	private String next;
	private String parent;
	private String bgColor;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getHasImage() {
		return hasImage;
	}

	public void setHasImage(String hasImage) {
		this.hasImage = hasImage;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTimeRecorded() {
		return timeRecorded;
	}

	public void setTimeRecorded(String timeRecorded) {
		this.timeRecorded = timeRecorded;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
