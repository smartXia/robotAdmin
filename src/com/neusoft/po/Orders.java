package com.neusoft.po;

import java.util.Date;

public class Orders {
    private Integer orderId;

    private Integer number;

    private String userName;

    private String robotImage;

    private Integer robotPrice;

    private String robotName;

    private String robotCom;

    private Date createTime;

    private String note;

    private String orderState;

    private Long water;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRobotImage() {
        return robotImage;
    }

    public void setRobotImage(String robotImage) {
        this.robotImage = robotImage == null ? null : robotImage.trim();
    }

    public Integer getRobotPrice() {
        return robotPrice;
    }

    public void setRobotPrice(Integer robotPrice) {
        this.robotPrice = robotPrice;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName == null ? null : robotName.trim();
    }

    public String getRobotCom() {
        return robotCom;
    }

    public void setRobotCom(String robotCom) {
        this.robotCom = robotCom == null ? null : robotCom.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public Long getWater() {
        return water;
    }

    public void setWater(Long water) {
        this.water = water;
    }
}