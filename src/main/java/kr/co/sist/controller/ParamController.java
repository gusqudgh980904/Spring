package kr.co.sist.controller;
import java.sql.Array;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ParamController {

	@RequestMapping(value="/use_request.do",method=RequestMethod.GET)
	public String requestFrom() {
	
		return "use_request_form";
	}//requestForm
		
	
	@RequestMapping(value="/request_process.do",method=RequestMethod.GET)
	public String requestProcess(HttpServletRequest request, Model model) {
		//HttpServletRequest�� ����Ͽ� web parameter�� �ޱ�
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String lang[]=request.getParameterValues("lang");
		
		System.out.println(name+"/"+age+"/"+Arrays.toString(lang));
		model.addAttribute("lang",lang);
		
		return "request_process";
	}//requestForm
	
}//class
