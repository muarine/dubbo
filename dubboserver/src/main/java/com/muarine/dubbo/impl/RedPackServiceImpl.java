/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2015 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.dubbo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.muarine.dubbo.RedPackService;

/**
 * RedPackServiceImpl.
 * 
 * @author muarine
 * @since 2.1.6
 */
@Service
public class RedPackServiceImpl implements RedPackService{

	private final static Logger log = LoggerFactory.getLogger(RedPackService.class);
	
	public Integer inputRedPacks() {
		log.info("开始执行批量录入红包");
		// 红包录入
		return 1;
	}

	public List<Object> selectActs() {
		log.info("开始执行查询红包活动");
		// 红包活动列表
		return null;
	}

}
