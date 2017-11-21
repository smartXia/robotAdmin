package com.neusoft.po;

import java.util.Date;

public class Orderdetails {
    private Integer id;

    private String userName;

    private Long detailId;

    private String orderId;

    private Date createTime;

    private String payway;

    private String sendway;

    private String orderStatu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public String getSendway() {
        return sendway;
    }

    public void setSendway(String sendway) {
        this.sendway = sendway == null ? null : sendway.trim();
    }

    public String getOrderStatu() {
        return orderStatu;
    }

    public void setOrderStatu(String orderStatu) {
        this.orderStatu = orderStatu == null ? null : orderStatu.trim();
    }
}