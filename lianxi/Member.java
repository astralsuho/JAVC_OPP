package lianxi;

public class Member {
	
	String id,name,ssn,pass; 	//필드 스트링				
	Member(String id,String name,String ssn,String pass){//파라미터
	this.id = id; 								
	this.name =name;							//this기능
	this.ssn = ssn;
	this.pass = pass;
	}//area
	
	public String info() {
		return String.format("ID :%s"
				+ "\n이름 : %s"
				+ "\n신분증 :%s"
				+ "\n패스워드 : %s",
				id,name,ssn,pass);
	}
	
}//field
