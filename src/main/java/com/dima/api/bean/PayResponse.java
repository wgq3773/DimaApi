package com.dima.api.bean;

import java.io.Serializable;
import java.util.Map;

public class PayResponse implements Serializable {

	private static final long serialVersionUID = -7584693690947236820L;

	// 响应状态
	private String respondCode;
	// 响应描述
	private String respondDesc;
	// 支付状态
	private String payStatus;
	// 支付描述
	private String payDesc;
	// 支付参数Map
	private Map<String, String> param;
	

	public Map<String, String> getParam() {
		return param;
	}

	public void setParam(Map<String, String> param) {
		this.param = param;
	}

	public String getRespondCode() {
		return respondCode;
	}

	public void setRespondCode(String respondCode) {
		this.respondCode = respondCode;
	}

	public String getRespondDesc() {
		return respondDesc;
	}

	public void setRespondDesc(String respondDesc) {
		this.respondDesc = respondDesc;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayDesc() {
		return payDesc;
	}

	public void setPayDesc(String payDesc) {
		this.payDesc = payDesc;
	}

	@Override
	public String toString() {
		return "PayResponse [respondCode=" + respondCode + ", respondDesc=" + respondDesc + ", payStatus=" + payStatus
				+ ", payDesc=" + payDesc + ", param=" + param + "]";
	}
}
