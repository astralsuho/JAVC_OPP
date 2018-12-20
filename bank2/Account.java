package bank2;
import java.text.SimpleDateFormat;
import java.util.Random;//랜덤 입력해 주려면 인폴트로 데이트를 불러와야함	
import java.util.Date; // 시간을 입력해 주려면 인폴트로 데이트를 불러와야함
public class Account {
	
	String accountNum; 
	String today;
	int money;
	Account (int money){//String accountNum,String today 보낼께 아니라 여기서 상주
		this.accountNum = this.makeAccountNum();
		this.today = this.maketoday();
		this.money = money;
	}
	public String makeAccountNum() {

		String accountNum ="";
		Random random = new Random();
		for(int i=0;i<8;i++) {
			if(i==3) {
				accountNum += random.nextInt(10)+"-";
			}else {
				accountNum += random.nextInt(10);
			}
		}
		return accountNum; 
	}
	public String maketoday() {
		String maketoday = "";
		Date date = new Date();
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = time.format(date);
		return maketoday;
	}
	public String makeopen(String name) {
		return String.format("은행이름:%s\n"
				+ "계좌번호:%s\n"
				+ "이 름: %s \n"
				+ "날 짜: %s \n"
				+ "잔 액: %d",accountNum,name,today,money);
		
	}
	
	
	
}
