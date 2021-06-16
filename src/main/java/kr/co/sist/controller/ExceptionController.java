package kr.co.sist.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {

	@RequestMapping(value="/day0615/exception.do",method=RequestMethod.GET)
	//throws된 예외는 @ExceptionHandelr가 없다면 Spring Framework이 잡는다.
	public String exceptionThrow() throws Exception {
		
		if(new Random().nextBoolean()) {
			throw new Exception("발생된 예외 또는 Service에서 throws된 예외");
		}//if
		
		return "day0615/success";
	}//exceptionThrow

	@ExceptionHandler(Exception.class)//발생된 예외를 비교할 목적의 annotation
	//Controller안에서 발생된 예외를 처리할 목적의 method
	//반환형을 ModelAndView로 설정하고,발생된 예외를 받기 위해 매개변수로 예외처리 클래스를 정의
	public ModelAndView exceptionProcess(Exception e) {
		e.printStackTrace();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("day0615/exception");
		mav.addObject("err_msg",e.getMessage());
		mav.addObject("err_msg2",e);
		
		
		return mav;
	}//exceptionProcess
	
	
}
