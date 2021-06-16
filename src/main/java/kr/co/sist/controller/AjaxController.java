package kr.co.sist.controller;

import java.util.Random;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	
	/**
	 * 요청처리URL과 응답되는 jsp의 이름이 같다면 반환형이 jsp명을 반환하지 않아도 동일한 이름의 jsp로 ViewResolver가 추적한다
	 */
	@RequestMapping(value="/day0616/ajax_form.do",method=RequestMethod.GET)
	public void ajaxForm() {
		
		
	}//ajaxForm
	
	@RequestMapping(value="/day0616/use_jsp.do",method= {RequestMethod.GET,RequestMethod.POST})
	public String useJsp(String name,Model model) {
		String[] msg={"하하1","하하2","하하3","하하4","하하5"};
		
		JSONObject json=new JSONObject();
		json.put("msg",name+":"+msg[new Random().nextInt(msg.length)]);
		//생성된 JSONObject를 JSP로 전달하기 위해 Model에 추가
		model.addAttribute("res_msg",json.toJSONString());
		
		return "day0616/jsp_json";
	}//useJsp
	
	//응답이 JSON으로 되어야 한다면 JSP를 만들지 않고 JSONObject을 바로 출력할 수 있다
	@RequestMapping(value="/day0616/use_jsp1.do",method= {RequestMethod.GET,RequestMethod.POST},
			produces="application/json;charset=UTF-8")
	@ResponseBody
	public String useJsp1(String name1) {
		String[] msg={"하하1","하하2","하하3","하하4","하하5"};
		
		JSONObject json=new JSONObject();
		json.put("msg",name1+":"+msg[new Random().nextInt(msg.length)]);
		
		//응답이 JSP가 되는 것이 아니고,JSON이 응답된다.
		return json.toJSONString();
	}//useJsp
	
}
