package com.dima.api.enums;

public enum OrderStatus {

	//0:初始状态,1:支付中,2:支付待确认,3:已支付,4:退款中,5:已退款,6:异常订单
	ORIGINAL("0", "初始状态"),
	PAYING("1", "支付中"),
	NOTCONFIRMED("2", "支付待确认"),
	SUCCESS("3", "已支付"),
	REFUNDING("4", "退款中"),
	REFUNDED("5", "已退款"),
	EXCEPTION("6", "异常订单");

	private String status;
	private String desc;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	private OrderStatus(String status, String desc) {
		this.status = status;
		this.desc = desc;
	}

}