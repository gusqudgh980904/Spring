package kr.co.service;

import java.util.ArrayList;
import java.util.List;

import kr.co.sist.domain.IncludeDomain;

public class includeService {

	public List<IncludeDomain> searchNick(){
		List<IncludeDomain> list=new ArrayList<IncludeDomain>();
		
		list.add(new IncludeDomain("������",25));
		list.add(new IncludeDomain("���μ�",26));
		list.add(new IncludeDomain("�����",23));
		list.add(new IncludeDomain("����ȣ",24));
		
		return list;
	}
	
}
