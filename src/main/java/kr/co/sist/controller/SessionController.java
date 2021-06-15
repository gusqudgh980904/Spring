package kr.co.sist.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"name","age"})//세션에 할당할 값이 n개인 경우 배열을 사용
public class SessionController {

	
	@RequestMapping(value="/day0614/use_session_a.do",method=RequestMethod.GET)
	public String useSessionA(Model model) {
		
		model.addAttribute("name","한상민");//request,session=>값을 모든 페이지에서 사용가능
		model.addAttribute("nick","thumb");//request=>값을 forward로 이동한 다음 페이지에서만 사용가능
		model.addAttribute("age",20);//request,session=>ㅏㅄ을 모든 페이지에서 사용가능
		
		
		return "day0614/use_session_a";
	}//useSessionA
	

	@RequestMapping(value="/day0614/use_session_b.do",method=RequestMethod.GET)
	public String useSessionB(HttpSession session) {
		//Controller에서 세션의 값을 받을 때에는 매개변수로 HttpSession을 선언한다
		System.out.println("name="+session.getAttribute("name")+",age="+session.getAttribute("age"));
		
		
		return "day0614/use_session_b";
	}//useSessionB
	@RequestMapping(value="/day0614/use_session_c.do",method=RequestMethod.GET)
	public String useSessionC(SessionStatus ss) {
		//세션사용이 완료되었다면(로그아웃)
		ss.setComplete();

		return "day0614/use_session_c";
	}//useSessionC
	
	
	@RequestMapping(value="/day0615/set_cookie.do",method=RequestMethod.GET)
	public String addCookie(HttpServletResponse response) {
		
		//쿠키를 심는 것은 키존의 코드와 같다.
		//1.쿠키생성
		Cookie cookie=new Cookie("name","현병호");
		Cookie cookie2=new Cookie("age","24");
		//2.쿠키의 파기시간 설정
		cookie.setMaxAge(60*2);
		cookie2.setMaxAge(60*2);
		
		//3.쿠키심기
		response.addCookie(cookie);
		response.addCookie(cookie2);
		
		
		return "redirect:http://localhost/sist/index.html";
	}//addCookie
	
	
	@RequestMapping(value="/day0615/get_cookie.do",method=RequestMethod.GET)
	public String readCookies(@CookieValue(value="name",defaultValue = "익명")String name,
							@CookieValue(value="age",defaultValue = "0") String age) {
		
		System.out.println("쿠키 읽기 이름 :"+name+",나이:"+age);
		
		return "day0615/read_cookie";
	}//readCookies
	
}
