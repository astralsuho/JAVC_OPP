package bank1;
import java.util.Date; // today 오류날시 util 체크해주길
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Random;
public class Account {
	final static String BANK_NAME = "한빛은행"; 
	String accountNum,today;
		int money;	 
	Account(int money){
		this.accountNum = makeAccountNum();
		this.today = makeToday();
		this.money = money;
	}	
	 public String makeAccountNum() {
		 String accountNum = "";
		 Random random = new Random();
		 for(int i=0;i<8;i++) { // 계좌번호는 8자리니까..
			 if(i==3) { // 왜 3인가? 3번째 자리마다 -를 붙여 달라는 건가?
				 accountNum += random.nextInt(10)+"-";
			 }else {
				 accountNum += random.nextInt(10); 
			 }
		 }
		 return accountNum;
	 } //makeAccountNum line
	
	 public String makeToday() {
		 String today = "";
		 Date date = new Date();
		 SimpleDateFormat time = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		 today = time.format(date);
		 return today;
	 }
	 
	 public String makeinfo(String name) {
		 
		 return String.format("은행이름 :%s \n"
		 		+ "계좌번호 :/s\n"
		 		+ "이 름 : /s\n"
		 		+ "날 짜 : /s\n"
		 		+ "잔 액 : /s\n",BANK_NAME,accountNum,name,today,money);
	 }							//name은 언디서 추출하는걸까..
}//end line
