package bank;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true){
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입"
					+ "2.계좌개설"
					+ "3.계좌보기"
					+ "4.입금"
					+ "5.출금\n")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료");
				return;
			case "1":
				String id = JOptionPane.showInputDialog("ID를 입력해주세요");
				String name = JOptionPane.showInputDialog("이름을 입력해주세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력해주세요");
				String pass = JOptionPane.showInputDialog("패스워드를 입력해주세요");		
				JOptionPane.showMessageDialog(null,"회원 가입이 완료 되었습니다.");
				member = new Member(id, name, ssn, pass); // 아래 3놈이 인포 정보를 전달함
				String info = member.info(); //member info란에 있는 획원 정보를 가져온다.
				JOptionPane.showMessageDialog(null,info);
				break;
			case "2":
				account = new Account(0);  //여기 아규먼트는 인트값만 보내주면 된다
				JOptionPane.showMessageDialog(null,"계좌가 생성되었습니다.");
				break;
			case "3":
				String open = account.info(member.name); // 왜 여기서 맴버네임 인가?
				JOptionPane.showMessageDialog(null,open);
				break;
			}
		
			
			
		}
}
	}
