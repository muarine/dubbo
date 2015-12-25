/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2015 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.dubbo.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.muarine.domain.LogApi;
import com.muarine.dubbo.database.base.CrudDao;
import com.muarine.dubbo.database.base.MysqlDaoSupport;

/**
 * LogApiDao.
 * 
 * @author muarine
 * @since 2.1.6
 */
@Repository
public class LogApiMasterDao extends MysqlDaoSupport implements CrudDao<LogApi>{
	
	@Override
	public LogApi findById(long id) {
		return (LogApi) getSqlSession().selectOne("findById", id);
	}

	@Override
	public int add(LogApi entity) {
		return getSqlSession().insert("insert", entity);
	}

	@Override
	public int delete(LogApi entity) {
		return this.deleteById(entity.getId());
	}

	@Override
	public int deleteById(long id) {
		return getSqlSession().delete("delete", id);
	}

	@Override
	public int update(LogApi entity) {
		return getSqlSession().update("update", entity);
	}

	/**
	 * FIXME Comment this
	 * 
	 * @return
	 */
	public List<LogApi> findAll() {
		return getSqlSession().selectList("select");
	}
	
	
	
	
}
