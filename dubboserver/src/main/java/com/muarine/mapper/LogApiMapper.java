package com.muarine.mapper;

import java.util.List;

import com.muarine.domain.LogApi;


public interface LogApiMapper {
    
	List<LogApi> select();
	
	Long insert(LogApi logApi);
	
}