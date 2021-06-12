package kr.co.sist.vo;

import java.util.Arrays;

public class ParamVO {
	private String nick;
	private int age;
	private String[] movie;
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
	public String[] getMovie() {
		return movie;
	}
	public void setMovie(String[] movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "ParamVO [nick=" + nick + ", age=" + age + ", movie=" + Arrays.toString(movie) + "]";
	}
	
	

}
