package kr.co.sist.dao;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	public List<String> selectImg(){
		List<String> imgList=new ArrayList<String>();
		imgList.add("��í��1.jpg");
		imgList.add("��í��2.jpg");
		imgList.add("��í��3.jpg");
		imgList.add("��í��4.jpg");
		
		return imgList;
	}//selectImg
	
	
	public List<String> selectNotice(){
		List<String> noticeList=new ArrayList<String>();
		noticeList.add("�Ͽ��� 08~���⳪��");
		noticeList.add("����ϱ����� �۾�����");
		noticeList.add("���� �۵θ�° �ٲ��ְڴ�");
		noticeList.add("���ؽ�");
		
		return noticeList;
	}//selectImg

}
