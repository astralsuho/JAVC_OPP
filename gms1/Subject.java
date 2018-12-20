package gms1;
/*
 * Suject 
[속성] String subjName,today; int scoer; 
[기능] exam //시험
,today()//오늘날짜 생성**/


public class Subject {
	String subjName,today; // 스트링에서 ; 끊어주려고  
	int scoer; // 인트  헷갈리지 말라고 내려줌
	Subject(String subjName,String today,
			int scoer){
		this.subjName = subjName; //속성을 적어줌
		this.today = today;
		this.scoer =scoer;
	}
		public String exam() {//기능을 적어주고
			String exam = "";
			return exam;
		}
		public String today() {
			String today = "";
			return today;
		}
		public String info() {
			String info = "";
			return info;
		}
}
