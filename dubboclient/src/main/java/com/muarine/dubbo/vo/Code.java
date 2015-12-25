/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2015 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.dubbo.vo;

/**
 * Code. 返回码
 * 
 * @author Muarine maoyun@rtmap.com
 * @date 2015年6月29日
 * @since 0.1
 */
public class Code {
	//		全局返回码
	/**
	 * <账户>登录验证-用户名密码错误
	 */
	public static final String ERROR_UP = "100";		// 
	/**
	 * <全局>非法操作
	 */
	public static final String ERROR_INVAILD = "101";		// 
	/**
	 * <全局> 非法的APPID
	 */
	public static final String INVAILD_APPID = "102";
	/**
	 * <全局>请求成功
	 */
	public static final String SUCCESS = "200";
	/**
	 * <全局>签名失败
	 */
	public static final String ERROR_SIGN = "300";
	/**
	 * <全局>参数不能为空
	 */
	public static final String NULL_PARAM = "400";
	/**
	 * <全局>服务器异常
	 */
	public static final String ERROR = "500";
	
	/**
	 * <摇一摇周边> 非法的参数
	 */
	public static final String INVAILD_PARAM = "90002";
	
	/**
	 * <摇一摇周边> 该位置不在摇停车区域内
	 */
	public static final String PARK_NOTFOUND = "41001";
	
	
}
