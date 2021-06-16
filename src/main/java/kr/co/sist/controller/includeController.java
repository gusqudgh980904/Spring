package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.service.includeService;

@Controller
public class includeController {

	@RequestMapping("/day0615/include.do")//value�� method�� ������ �� �ִ�.
	public String request(Model model) {
		
		includeService is=new includeService();
		model.addAttribute("list",is.searchNick());
		
		return "day0615/views_include";
	}//request
	
	@RequestMapping("/day0615/use_include.do")//value�� method�� ������ �� �ִ�.
	public String include() {
		
		
		return "day0615/use_include";
	}//request
	
}
