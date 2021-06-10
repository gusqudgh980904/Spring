package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//1.HandlerMapper�� �������� Ŭ������ component-scan�� �� �ֵ��� �ϱ� ����
//@Controller annotation�� ����
@Controller
public class HelloController {

	//2.URL�� ó���� �� �ִ� method�� �����ϰ� return���� view�� ���������� �ش�
	@RequestMapping(value="/hello.do",method=RequestMethod.GET)	
	public String hello() {
			
			
			return "hello_mvc";
		}//hello
	
}//HelloController
