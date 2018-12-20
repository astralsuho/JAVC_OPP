package bank;
import java.util.Random;


public class Account {
	final static String BANK_NAME = "KB은행"; //고정값
	String accountNum,today; //머니는 인트값
	int money;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.today = today;
		this.money = money;
		}
	public String generatorAccountNum() {
		String accountNum = ""; //어카운트에 랜덤을 넣어주는 작업
		Random random = new Random();
		for(int i=0;i<8;i++) {
			if(i==3) {
				accountNum += random.nextInt(10)+"-";
			}else{
				accountNum += random.nextInt(10);
			}
			
		}
		
		return accountNum;
	}
	public String info(String name) {
		return String.format("은행이름:%s\n"
				+ "계좌번호:%s\n"
				+ "이 름: %s \n"
				+ "날 짜: %s \n"
				+ "잔 액: %d",BANK_NAME,accountNum,name,today,money);
		
	}
}