package com.example;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Excel {
	private String number;// 编号
	private String companyName;// 超市名称
	private String orderNo;// 订单号
	private String store;// 门店
	private Integer orderGoodsNum;// 商品数量
	private BigDecimal price;// 订单金额
	private java.sql.Timestamp orderDate;// 下单时间
	private java.sql.Timestamp payTime;// 支付时间
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getOrderGoodsNum() {
		return orderGoodsNum;
	}
	public void setOrderGoodsNum(Integer orderGoodsNum) {
		this.orderGoodsNum = orderGoodsNum;
	}
	public java.sql.Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(java.sql.Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	public java.sql.Timestamp getPayTime() {
		return payTime;
	}
	public void setPayTime(java.sql.Timestamp payTime) {
		this.payTime = payTime;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
