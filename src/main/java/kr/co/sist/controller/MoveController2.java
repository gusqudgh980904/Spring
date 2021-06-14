package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.service.MainService;

@Controller
//@RequestMapping("/day0614"):공통으로 요청처리 앞에 이름을 사용해야 한다면 사용
public class MoveController2 {
	
	//View페이지와 데이터를 한번에 관리하는 객체 ModelAndView 반환
	@RequestMapping(value="/day0614/use_mav.do",method=RequestMethod.GET)
	public ModelAndView useMAV() {
		
		//ModelAndView생성
		ModelAndView mav=new ModelAndView();
		//view페이지명을 설정
		mav.setViewName("day0614/use_mav");
		
		//Business Logic 구현하는 클래스를 객체화
		MainService ms=new MainService();
		//View페이지에서 사용할 데이터 입력
		mav.addObject("img",ms.mainImgList());
		mav.addObject("notice",ms.noticeList());
		
		return mav;
	}//useMAV
	
	@RequestMapping(value="/day0614/use_redirect.do",method=RequestMethod.GET)//redirect를 쓰면 webapp에서 불러옴
	public String useRedirect() {
		
		return "redirect:../day0611/call.jsp";
	}

}
