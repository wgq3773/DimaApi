package com.dima.api.bean;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

	private static final long serialVersionUID = 4761096706526086246L;

	// 订单号
	private String orderId;
	// 订单用户ID
	private String orderUserId;
	// 订单金额（分）
	private String orderMoney;
	// 支付金额（分）
	private String payMoney;
	// 订单状态	0:初始状态,1:支付中,2:支付待确认,3:已支付,4:退款中,5:已退款,6:异常订单
	private String orderStatus;
	// 订单生成时间
	private Date orderGenData;
	// 订单支付时间
	private Date payDate;
	// 订单通知时间
	private Date notifyDate;
	// 订单描述
	private String orderDesc;
	// 上游订单号
	private String channelOrderId;
	// 下游订单号
	private String juniorOrderId;

	public String getOrderUserId() {
		return orderUserId;
	}

	public void setOrderUserId(String orderUserId) {
		this.orderUserId = orderUserId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(String orderMoney) {
		this.orderMoney = orderMoney;
	}

	public String getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderGenData() {
		return orderGenData;
	}

	public void setOrderGenData(Date orderGenData) {
		this.orderGenData = orderGenData;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Date getNotifyDate() {
		return notifyDate;
	}

	public void setNotifyDate(Date notifyDate) {
		this.notifyDate = notifyDate;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public String getChannelOrderId() {
		return channelOrderId;
	}

	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}

	public String getJuniorOrderId() {
		return juniorOrderId;
	}

	public void setJuniorOrderId(String juniorOrderId) {
		this.juniorOrderId = juniorOrderId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderUserId=" + orderUserId + ", orderMoney=" + orderMoney
				+ ", payMoney=" + payMoney + ", orderStatus=" + orderStatus + ", orderGenData=" + orderGenData
				+ ", payDate=" + payDate + ", notifyDate=" + notifyDate + ", orderDesc=" + orderDesc
				+ ", channelOrderId=" + channelOrderId + ", juniorOrderId=" + juniorOrderId + "]";
	}

}
