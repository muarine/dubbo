/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.muarine.dubbo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.muarine.domain.LogApi;
import com.muarine.dubbo.DemoService;
import com.muarine.dubbo.dao.impl.LogApiMasterDao;
import com.muarine.dubbo.dao.impl.LogApiSlave1Dao;
@Service
public class DemoServiceImpl implements DemoService {
	
	private final static Logger log = LoggerFactory.getLogger(DemoService.class);
	@Autowired
	private LogApiMasterDao logApiDao;
	@Autowired
	private LogApiSlave1Dao logApiSlave1Dao;
	
	public String sayHello(String name) {
    	log.info("开始执行Hello程序");
    	
    	// 查询数据库
    	List<LogApi> apis = logApiDao.findAll();
    	for (LogApi logApi : apis) {
			log.info("Master id:"+logApi.getId()+" action: " + logApi.getAction() + ",method:" + logApi.getMethod());
			break;
		}
    	
    	System.out.println("-----------------------------------------");
    	
    	List<LogApi> apis1 = logApiSlave1Dao.findAll();
    	for (LogApi logApi : apis1) {
			log.info("Slave id:"+logApi.getId()+" action: " + logApi.getAction() + ",method:" + logApi.getMethod());
			break;
		}
    	
        return "执行完毕";
    }
    
}