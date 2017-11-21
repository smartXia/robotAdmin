package com.neusoft.po;

import java.util.Date;

public class CommitTopic {
    private Integer commitId;

    private Integer commitTopic;

    private String commitUser;

    private Date commitTime;

    private String commitContext;

    private Integer commitLove;

    public Integer getCommitId() {
        return commitId;
    }

    public void setCommitId(Integer commitId) {
        this.commitId = commitId;
    }

    public Integer getCommitTopic() {
        return commitTopic;
    }

    public void setCommitTopic(Integer commitTopic) {
        this.commitTopic = commitTopic;
    }

    public String getCommitUser() {
        return commitUser;
    }

    public void setCommitUser(String commitUser) {
        this.commitUser = commitUser == null ? null : commitUser.trim();
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public String getCommitContext() {
        return commitContext;
    }

    public void setCommitContext(String commitContext) {
        this.commitContext = commitContext == null ? null : commitContext.trim();
    }

    public Integer getCommitLove() {
        return commitLove;
    }

    public void setCommitLove(Integer commitLove) {
        this.commitLove = commitLove;
    }
}