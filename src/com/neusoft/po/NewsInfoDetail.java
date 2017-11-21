package com.neusoft.po;

public class NewsInfoDetail extends NewsInfo {
	private NewsType type;
	private NewsAuthor author;
	/**
	 * @return the type
	 */
	public NewsType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(NewsType type) {
		this.type = type;
	}
	/**
	 * @return the author
	 */
	public NewsAuthor getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(NewsAuthor author) {
		this.author = author;
	}

	
}
