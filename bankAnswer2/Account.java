package bankAnswer2;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 계좌 클래스
 * [속성]
 * 상수 : BANK_NAME
 * 멤버변수 :  
 * 1. accountNum 계좌번호
 * 2. money 잔액
 * 3. today 해당일
 * [기능]
 * 1. generatorAccountNum() 계좌번호생성(랜덤)
 * 2. today() 해당일생성
 * 3. withdraw() 출금하기
 * 4. deposit() 입금하기
 * 5. info() 계좌정보
 * */
public class Account {
	final static String BANK_NAME = "KB은행"; 
	String accountNum;
	int money; 
	String today;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}
	public String generatorAccountNum() {
		//랜덤 입력해 주려면 인폴트로 데이트를 불러와야함
		String accountNum = "";
		Random random = new Random();
		for(int i = 0;i<8;i++) {
			if(i==3) {
				accountNum += random.nextInt(10)+"-";
			}else {
				accountNum += random.nextInt(10);
			}
		}
		// 1234-5678
		return accountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();// 시간을 입력해 주려면 인폴트로 데이트를 불러와야함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		today = sdf.format(date);
		return today;
	}
	/**
	 * 출금하기
	 * */
	public String withdraw(int money) {
		String message = "";
		if(money > 0 && this.money>=money) {
			this.money -= money;
			message = "거래완료";
		}else {
			message = "입금액이 잘못되었거나 잔고가 부족합니다";
		}
		return message;
	}
	/**
	 * 입금하기
	 * */
	public String deposit(int money) {
		String message = "";
		if(money > 0) {
			this.money += money;
			message = "거래완료";
		}else {
			message = "입금액이 잘못되었습니다";
		}
		return message;
		
	}

	public String info(String name) {
		
		return String.format("은행이름:%s\n"
				+ "계좌번호:%s\n"
				+ "이 름: %s \n"
				+ "날 짜: %s \n"
				+ "잔 액: %d",BANK_NAME,accountNum,name,today,money);
		
	}
	
	
	
}