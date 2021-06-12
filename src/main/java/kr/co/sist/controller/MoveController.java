package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.service.MainService;

@Controller
@RequestMapping("/day0611_sub")//사용할 공통 경로설정
public class MoveController {

	//공통경로가 적용된 경로
	@RequestMapping(value="/redirect.do",method=RequestMethod.GET)
	public String useRedirect() {
		
		
//		return "day0611/call";//ViewResolver를 사용한 forward방식 페이지 이동
		return "redirect:http://localhost/sist/day0611/call.jsp";
		//ViewResolver를 거치지 않고 페이지를 요청하므로 파일의 확장자를 포함한 모든 경로를 설정
	}//useRedirect

	
	@RequestMapping(value="/do_call_a.do",method=RequestMethod.GET)
	public String callA() {
		
		
		return "forward:do_call_b.do";
	}//useRedirect
	@RequestMapping(value="/do_call_b.do",method=RequestMethod.GET)
	public String callB() {
		
		
		return "day0611/call_b_result";
	}//useRedirect
	
	
	@RequestMapping(value="/use_model.do",method=RequestMethod.GET)
	public String useModel(Model model) {
		
		String returnPage="day0611/use_model";
		
		//업무로직을 구현한 클래스를 사용
		MainService ms=new MainService();
		model.addAttribute("imgList",ms.mainImgList());
		model.addAttribute("noticeList",ms.noticeList());
		
		return returnPage;
	}//useModel
	
}
