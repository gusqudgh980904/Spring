package kr.co.service;

import java.util.ArrayList;
import java.util.List;

import kr.co.sist.domain.IncludeDomain;

public class includeService {

	public List<IncludeDomain> searchNick(){
		List<IncludeDomain> list=new ArrayList<IncludeDomain>();
		
		list.add(new IncludeDomain("°û¹ü¼ö",25));
		list.add(new IncludeDomain("°­ÀÎ¼·",26));
		list.add(new IncludeDomain("±è´ö¿µ",23));
		list.add(new IncludeDomain("Çöº´È£",24));
		
		return list;
	}
	
}
