package kr.co.sist.controller;
import java.sql.Array;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.vo.ParamVO;
@Controller//("day0611")
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
	
	
	/**
	 * ��û�� ���� �� ���� �����ϴ� ó��
	 * @return jsp��
	 */
	@RequestMapping(value="/use_single_param.do",method=RequestMethod.GET)
	public String singleParamForm() {
		
		return "single_param_form";
	}//singleParamForm
	
	
	/**
	 * ������(int,String,boolean...)�� ��� �ش� ���������� ����Ͽ� parameter�� �����ָ�
	 * web parameter�� �ش� ������ ����ȯ�Ǿ� �Էµȴ�
	 * @param nick
	 * @param age
	 * @return
	 */
	@RequestMapping(value="single_param_process.do",method=RequestMethod.GET)
	public String singleParamProcess(String nick,@RequestParam(defaultValue = "0") int age) {
		
		
		
		System.out.println("�г���:"+nick+",����:"+age);
		
		return "single_param_process";///day0611/single_param_process
	}//singleParamProcess

	
	@RequestMapping(value="/day0611/use_vo.do",method=RequestMethod.GET)
	public String voForm() {
		
		
		
		
		return "day0611/vo_form";///day0611/single_param_process
	}//voForm
	

	
	@RequestMapping(value="/day0611/vo_process.do",method=RequestMethod.GET)
	public String voProcess(ParamVO pVO,Model model) {
		
		System.out.println(pVO);
		
		model.addAttribute("movie",pVO.getMovie());
		
		return "day0611/vo_process";///day0611/single_param_process
	}//voProcess
	
	
	
}//class
