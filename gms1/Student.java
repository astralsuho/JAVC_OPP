package gms1;
/**
Student
[속성] 명사:: id , name, ssn, pass 
[기능] 동사:: 회원정보 보여주기 info();
Suject 
[속성] String subjName,today; int scoer; 
[기능] exam //시험
,today()//오늘날짜 생ㅅ성
scoer;
 * */


public class Student {
	String id, name, ssn, pass;
	Student(String id,String name,String ssn,String pass){
		this.id = id;
		this.name = name;  				//조건
		this.ssn = ssn;
		this.pass =pass;
	}
	public String info() {
		String info = "";				//기능
		return info;
	}
}
