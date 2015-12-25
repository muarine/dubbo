package com.muarine.dubbo.action;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 * BaseController.
 * 
 * @author Muarine maoyun@rtmap.com
 * @date 2015年7月8日
 * @since 2.0
 */
public class BaseController{
	
	protected Logger log = LoggerFactory.getLogger(BaseController.class);
	
	/**
	 * 全局返回码
	 */
	protected Map<String,String> codeMap ;
	/**
	 * 全局常量Map
	 */
	protected Map<String,String> commonMap ;
	
	/**
	 * Create a new BaseController.
	 * 
	 * @param queryParamNames
	 */
	public BaseController(String... queryParamNames) {
		super();
	}
	
	
	
	public void setCodeMap(Map<String, String> codeMap) {
		this.codeMap = codeMap;
	}
	public void setCommonMap(Map<String, String> commonMap) {
		this.commonMap = commonMap;
	}
	
	
	
	
	
	
	

}
