package bank1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.계좌개설\n"
					+ "3.계좌보기\n"
					+ "4.입급\n"
					+ "5.송금")) {
			case "0" :
				JOptionPane.showMessageDialog(null,"종료");
				return;
			
			case "1" :
				String id = JOptionPane.showInputDialog("ID를 입렵해 주세요");
				String name = JOptionPane.showInputDialog("이름을 입력해 주세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력해 주세요");
				String pass = JOptionPane.showInputDialog("패스워드를 입력해주세요");
				JOptionPane.showMessageDialog(null,"회원가입을 축하드립니다!");
				member = new Member(id, name, ssn, pass); // main info에 있는 획원 정보를 가져온다.
				String info = member.info(); // member info란에 있는 획원 정보를 가져온다.
				JOptionPane.showMessageDialog(null,info);
				break;
			
			case "2" :
				account = new Account(0);
				JOptionPane.showMessageDialog(null,"계좌가 생성되었습니다.");
				break;
			
			case "3" :
				String info2 = account.makeinfo(member.name); // 왜 여기서 맴버네임 인가?
				JOptionPane.showMessageDialog(null,info2);
				break;
			}
			
		}
	}
}
