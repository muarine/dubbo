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
package com.muarine.dubbo.action;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.muarine.dubbo.DemoService;
import com.muarine.dubbo.RedPackService;

@Controller
public class DemoAction{
	
	private DemoService demoService;
	
	private RedPackService redPackService;
	
	
	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}

	public void setRedPackService(RedPackService redPackService) {
		this.redPackService = redPackService;
	}

	@RequestMapping("/404.jsp")
	public @ResponseBody String test(){
		System.out.println("AAA");
		return "CNM";
	}
	
	@RequestMapping("/500.jsp")
	public @ResponseBody String error(){
		System.out.println("500");
		return "500";
	}

	@RequestMapping("/aaa")
	public @ResponseBody String aaa(){
		System.out.println("AAA");
		
		String result1 = demoService.sayHello("AAAA");
		System.out.println(result1);
		
		List<Object> list = redPackService.selectActs();
		
		System.out.println(list);
		
		return "AAA";
	}
}