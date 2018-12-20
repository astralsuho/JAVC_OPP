package lianxi2;

public class Member {

	String id,name,ssn,pass; //5번줄 선언 / 맴버변수 = 인스턴스 변수
	Member(String id,String name, String ssn,String pass){//6번줄 초기화를 분리하여 위해
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	} 
	/**
	 * 회원정보 보여주기 info*/
	
	public String info() {
		String info = "";
		return info;
	}
}
