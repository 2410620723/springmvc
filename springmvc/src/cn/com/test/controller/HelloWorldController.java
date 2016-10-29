package cn.com.test.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping(value="hello")
	public String helloWorld(Map<String, String> map){
		map.put("hello", "HelloWorld");
		map.put("hi", "你好");
		return "hello";
	}
	
	@RequestMapping(value="put/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public String testPut(@PathVariable("id")Integer id){
		System.out.println(id);
		return "put complete";
	}
	
	@RequestMapping(value="delete/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public String testDelete(@PathVariable("id")Integer id){
		System.out.println(id);
		return "delete complete";
	}
	
	@RequestMapping(value="delete",method=RequestMethod.DELETE)
	@ResponseBody
	public String testDelete1(Integer id){
		System.out.println(id);
		return "delete complete";
	}
}
