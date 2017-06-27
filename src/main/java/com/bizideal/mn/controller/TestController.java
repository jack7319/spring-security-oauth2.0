package com.bizideal.mn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bizideal.mn.entity.UserInfo;

/**
 * @author liulq:
 * @data 2017年4月27日 下午9:10:50
 * @version 1.0
 */
@Controller
@RequestMapping("/t")
public class TestController {

	@RequestMapping("/t")
	@ResponseBody
	public UserInfo t() {
		return new UserInfo("abc", "123");
	}

	@RequestMapping("/f")
	public String f() {
		return "f";
	}

	@RequestMapping("/c")
	@ResponseBody
	public UserInfo c() {
		return new UserInfo("abc", "123");
	}

}
