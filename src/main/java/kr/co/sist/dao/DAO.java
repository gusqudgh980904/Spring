package kr.co.sist.dao;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	public List<String> selectImg(){
		List<String> imgList=new ArrayList<String>();
		imgList.add("포챠코1.jpg");
		imgList.add("포챠코2.jpg");
		imgList.add("포챠코3.jpg");
		imgList.add("포챠코4.jpg");
		
		return imgList;
	}//selectImg
	
	
	public List<String> selectNotice(){
		List<String> noticeList=new ArrayList<String>();
		noticeList.add("일요일 08~전기나감");
		noticeList.add("토요일까지만 작업가능");
		noticeList.add("삶을 송두리째 바꿔주겠다");
		noticeList.add("엄준식");
		
		return noticeList;
	}//selectImg

}
