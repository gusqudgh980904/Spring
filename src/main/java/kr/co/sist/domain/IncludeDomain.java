package kr.co.sist.domain;

import java.util.Arrays;

public class IncludeDomain {
	private String nick;
	private int age;
	
	
	public IncludeDomain(String nick, int age) {
		super();
		this.nick = nick;
		this.age = age;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
