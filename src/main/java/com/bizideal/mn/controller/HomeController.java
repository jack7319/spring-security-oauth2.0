package com.bizideal.mn.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/admin")
	@ResponseBody
	public List<String> admin() {
		return Arrays.asList("zhangsan", "lisi", "wangwu");
	}
}
