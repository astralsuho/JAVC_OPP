package bankAnswer4;

public interface AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다
	public String makeAccountNum();
	/**
	 * 오늘 날짜 구하기
	 * */
	public String makeToday();
	/**
	 * 계좌정보 보여주기
	 * */
	public String info(String accountNum,
			String name,
			String today,
			int money);
	/**
	 * 출금하기
	 * */
	public String withdraw(int money);
	/**
	 * 입금하기
	 * */
	public String deposit(int money);
}