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
	//throws�� ���ܴ� @ExceptionHandelr�� ���ٸ� Spring Framework�� ��´�.
	public String exceptionThrow() throws Exception {
		
		if(new Random().nextBoolean()) {
			throw new Exception("�߻��� ���� �Ǵ� Service���� throws�� ����");
		}//if
		
		return "day0615/success";
	}//exceptionThrow

	@ExceptionHandler(Exception.class)//�߻��� ���ܸ� ���� ������ annotation
	//Controller�ȿ��� �߻��� ���ܸ� ó���� ������ method
	//��ȯ���� ModelAndView�� �����ϰ�,�߻��� ���ܸ� �ޱ� ���� �Ű������� ����ó�� Ŭ������ ����
	public ModelAndView exceptionProcess(Exception e) {
		e.printStackTrace();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("day0615/exception");
		mav.addObject("err_msg",e.getMessage());
		mav.addObject("err_msg2",e);
		
		
		return mav;
	}//exceptionProcess
	
	
}
