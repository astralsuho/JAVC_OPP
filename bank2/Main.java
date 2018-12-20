package bank2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null; 
		while(true) {
			switch(JOptionPane.showInputDialog("0.시스템 종료\n"
					+ "1.회원가입\n"
					+ "2.계좌개설\n"
					+ "3.계좌보기\n"
					+ "4.입금\n"
					+ "5.출금")) {
			case "0" :
				JOptionPane.showMessageDialog(null,"0.시스템 종료");
				
				return;
			case "1" :	
				String id = JOptionPane.showInputDialog("ID를 입력해주세요");
				String name = JOptionPane.showInputDialog("이름을 입력해 주세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력해 주세요");
				String pass = JOptionPane.showInputDialog("패스워드를 입력해 주세요");
				JOptionPane.showMessageDialog(null,"회원가입이 완료되었습니다.");
			case "2" :	
				account = new Account(0);
				break;
			case "3" :
				String accountOpen = account.toString();
				
			}
		}
	}
	
}
