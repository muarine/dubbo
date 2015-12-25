/* 
 * RT MAP, Home of Professional MAP 
 * Copyright 2015 Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.muarine.dubbo.database.base;

import com.muarine.domain.BaseEntity;

/**
 * BaseDao.
 * 
 * @author muarine
 * @since 2.1.6
 */
public interface CrudDao<T extends BaseEntity> {
	
	public T findById(long id);
	
	public int add(T entity);
	
	public int delete(T entity);
	
	public int deleteById(long id);
	
	public int update(T entity);
	
}
