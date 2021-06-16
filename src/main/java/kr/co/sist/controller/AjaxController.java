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
	 * ��ûó��URL�� ����Ǵ� jsp�� �̸��� ���ٸ� ��ȯ���� jsp���� ��ȯ���� �ʾƵ� ������ �̸��� jsp�� ViewResolver�� �����Ѵ�
	 */
	@RequestMapping(value="/day0616/ajax_form.do",method=RequestMethod.GET)
	public void ajaxForm() {
		
		
	}//ajaxForm
	
	@RequestMapping(value="/day0616/use_jsp.do",method= {RequestMethod.GET,RequestMethod.POST})
	public String useJsp(String name,Model model) {
		String[] msg={"����1","����2","����3","����4","����5"};
		
		JSONObject json=new JSONObject();
		json.put("msg",name+":"+msg[new Random().nextInt(msg.length)]);
		//������ JSONObject�� JSP�� �����ϱ� ���� Model�� �߰�
		model.addAttribute("res_msg",json.toJSONString());
		
		return "day0616/jsp_json";
	}//useJsp
	
	//������ JSON���� �Ǿ�� �Ѵٸ� JSP�� ������ �ʰ� JSONObject�� �ٷ� ����� �� �ִ�
	@RequestMapping(value="/day0616/use_jsp1.do",method= {RequestMethod.GET,RequestMethod.POST},
			produces="application/json;charset=UTF-8")
	@ResponseBody
	public String useJsp1(String name1) {
		String[] msg={"����1","����2","����3","����4","����5"};
		
		JSONObject json=new JSONObject();
		json.put("msg",name1+":"+msg[new Random().nextInt(msg.length)]);
		
		//������ JSP�� �Ǵ� ���� �ƴϰ�,JSON�� ����ȴ�.
		return json.toJSONString();
	}//useJsp
	
}
