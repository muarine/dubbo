/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2015 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.dubbo.vo;

import java.lang.reflect.Field;

/**
 * Parameter.
 * 
 * @author Muarine maoyun@rtmap.com
 * @date 2015年7月8日
 * @since 2.0
 */
public class Parameter {
	
	private Long activityId;
	private Long marketId;
	private Long[] marketIds;
	private String countDate;
	
	private String openId;
	private String lottery_id;
	private String ticket;
	private String key;
	
	private Integer page;
	private Integer limit;
	private Integer total_fee;
	private String transaction_id;
	private String out_trade_no;
	
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getCountDate() {
		return countDate;
	}
	public void setCountDate(String countDate) {
		this.countDate = countDate;
	}
	public Long getActivityId() {
		return activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	public Long getMarketId() {
		return marketId;
	}
	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}
	public Long[] getMarketIds() {
		return marketIds;
	}
	public void setMarketIds(Long[] marketIds) {
		this.marketIds = marketIds;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(Integer total_fee) {
		this.total_fee = total_fee;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getLottery_id() {
		return lottery_id;
	}
	public void setLottery_id(String lottery_id) {
		this.lottery_id = lottery_id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	
	@Override
	public String toString() {
		Class<?> clazz = this.getClass();
		StringBuffer buffer = new StringBuffer();
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				String varName = field.getName();  
				try {
					boolean isAccess = field.isAccessible();
					if(!isAccess) field.setAccessible(true);
					Object o = field.get(this);
					if(o == null) continue;
					buffer.append("'"+varName+"'：").append(o).append("\n");
					if(!isAccess) field.setAccessible(false);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		return buffer.toString();
	}
}
