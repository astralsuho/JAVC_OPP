package bankAnswer5;

public interface AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다
	public String makeAccountNum();
	public String makeToday();
	public String info(String accouantNum,
			String name,
			String today,
			int money);
	public String withdraw(int money);
	public String deposit(int money);
}
