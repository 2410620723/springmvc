package cn.com.test.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("hello")
	public String helloWorld(Map<String, String> map){
		map.put("hello", "HelloWorld");
		map.put("hi", "你好");
		return "hello";
	}
}
