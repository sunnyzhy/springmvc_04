package com.zhy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * @RequestMapping
 * �������ദ���൱��webӦ�õĸ�Ŀ¼
 * �����ڷ��������൱��webӦ�õ���Ŀ¼
 * 
 * @RequestMapping�Ĳ�������
 * 1��value�������url������ʡ��
 * 2��method������ķ���
 * 3��params������Ĳ���
 * 4��headers������ͷ��HTTPЭ���header��
 * params�� headers֧�ּ򵥵ı��ʽ��
 * param1: ��ʾ������������Ϊ param1 �Ĳ���
 * !param1: ��ʾ�����ܰ�����Ϊ param1 �Ĳ��� 
 * param1 != value1: ��ʾ���������Ϊ param1 ���������������ֵ����Ϊ value1
 * {"param1=value1", "param2"}: ������������Ϊ param1��param2�������������� param1��ֵ����Ϊ value1
 * 
 * @RequestMapping֧��Ant����url
 * Ant����url֧��3��ƥ�����
 * ? ��ƥ��һ���ַ�
 * * ��ƥ�������ַ�����һ��·����
 * **��ƥ����·��
 * 
 * */
@RequestMapping("/spring")
@Controller
public class HelloWorld {

	private final String HELLOWORLD = "helloworld";
	
	/*
	 * value����
	 * */
	@RequestMapping(value = "/mvc")
	public String hello(){
		System.out.println("call controller");
		return HELLOWORLD;
	}
	
	/*
	 * method����
	 * */
	@RequestMapping(value="/mvc/method/get", method = RequestMethod.GET)
	public String mvcMethodGet(){
		System.out.println("get mvcMethod");
		return HELLOWORLD;
	}
	
	/*
	 * method����
	 * */
	@RequestMapping(value="/mvc/method/post", method = RequestMethod.POST)
	public String mvcMethodPost(){
		System.out.println("post mvcMethod");
		return HELLOWORLD;
	}
	
	/*
	 * params����
	 * */
	@RequestMapping(value="/mvc/params", method = RequestMethod.GET, params = {"username=Kate","age"})
	public String mvcParams(){
		System.out.println("mvcParams");
		return HELLOWORLD;
	}
	
	/*
	 * headers����
	 * */
	@RequestMapping(value="/mvc/headers", method = RequestMethod.GET, params = {"username=Kate","age"}, headers = {"Host=localhost:8080"})
	public String mvcHeaders(){
		System.out.println("mvcHeaders");
		return HELLOWORLD;
	}
	
	/*
	 * Ant���url
	 * */
	@RequestMapping(value="/mvc/ant/**/a")
	public String mvcAnt(){
		System.out.println("mvcAnt");
		return HELLOWORLD;
	}
	
	/*
	 * @PathVariable���� URL�е�ռλ�������󶨵��������������������
	 * URL�е� {xxx}ռλ������ͨ��@PathVariable("xxx")�󶨵������������
	 * */
	@RequestMapping(value="/mvc/pathvariable/{id}")
	public String mvcPathVariable(@PathVariable("id") Integer id){
		System.out.println("mvcPathVariable id:" + id);
		return HELLOWORLD;
	}
	
}
