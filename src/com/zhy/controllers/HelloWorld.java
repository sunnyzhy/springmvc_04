package com.zhy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * @RequestMapping
 * 定义在类处，相当于web应用的根目录
 * 定义在方法处，相当于web应用的子目录
 * 
 * @RequestMapping的参数包含
 * 1、value：请求的url，可以省略
 * 2、method：请求的方法
 * 3、params：请求的参数
 * 4、headers：请求头（HTTP协议的header）
 * params和 headers支持简单的表达式：
 * param1: 表示请求必须包含名为 param1 的参数
 * !param1: 表示请求不能包含名为 param1 的参数 
 * param1 != value1: 表示请求包含名为 param1 的请求参数，但其值不能为 value1
 * {"param1=value1", "param2"}: 请求必须包含名为 param1和param2的两个参数，且 param1的值必须为 value1
 * 
 * @RequestMapping支持Ant风格的url
 * Ant风格的url支持3种匹配符：
 * ? ：匹配一个字符
 * * ：匹配任意字符串（一层路径）
 * **：匹配多层路径
 * 
 * */
@RequestMapping("/spring")
@Controller
public class HelloWorld {

	private final String HELLOWORLD = "helloworld";
	
	/*
	 * value参数
	 * */
	@RequestMapping(value = "/mvc")
	public String hello(){
		System.out.println("call controller");
		return HELLOWORLD;
	}
	
	/*
	 * method参数
	 * */
	@RequestMapping(value="/mvc/method/get", method = RequestMethod.GET)
	public String mvcMethodGet(){
		System.out.println("get mvcMethod");
		return HELLOWORLD;
	}
	
	/*
	 * method参数
	 * */
	@RequestMapping(value="/mvc/method/post", method = RequestMethod.POST)
	public String mvcMethodPost(){
		System.out.println("post mvcMethod");
		return HELLOWORLD;
	}
	
	/*
	 * params参数
	 * */
	@RequestMapping(value="/mvc/params", method = RequestMethod.GET, params = {"username=Kate","age"})
	public String mvcParams(){
		System.out.println("mvcParams");
		return HELLOWORLD;
	}
	
	/*
	 * headers参数
	 * */
	@RequestMapping(value="/mvc/headers", method = RequestMethod.GET, params = {"username=Kate","age"}, headers = {"Host=localhost:8080"})
	public String mvcHeaders(){
		System.out.println("mvcHeaders");
		return HELLOWORLD;
	}
	
	/*
	 * Ant风格url
	 * */
	@RequestMapping(value="/mvc/ant/**/a")
	public String mvcAnt(){
		System.out.println("mvcAnt");
		return HELLOWORLD;
	}
	
	/*
	 * @PathVariable，将 URL中的占位符参数绑定到控制器处理方法的入参中
	 * URL中的 {xxx}占位符可以通过@PathVariable("xxx")绑定到方法的入参中
	 * */
	@RequestMapping(value="/mvc/pathvariable/{id}")
	public String mvcPathVariable(@PathVariable("id") Integer id){
		System.out.println("mvcPathVariable id:" + id);
		return HELLOWORLD;
	}
	
}
