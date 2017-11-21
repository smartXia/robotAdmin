package com.neusoft.po;

import org.springframework.web.multipart.MultipartFile;

public class Topic {
    private Integer topicId;

    private String topicTitle;

    private String topicImage;

    private String topicContext;
    private MultipartFile file;  
    /**
	 * @return the file
	 */
	public MultipartFile getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle == null ? null : topicTitle.trim();
    }

    public String getTopicImage() {
        return topicImage;
    }

    public void setTopicImage(String topicImage) {
        this.topicImage = topicImage == null ? null : topicImage.trim();
    }

    public String getTopicContext() {
        return topicContext;
    }

    public void setTopicContext(String topicContext) {
        this.topicContext = topicContext == null ? null : topicContext.trim();
    }
}