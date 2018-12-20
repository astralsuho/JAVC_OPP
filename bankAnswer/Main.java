package bankAnswer;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.회원가입 2.계좌개설 3.계좌보기 4.입금 5.출금")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
					String id = JOptionPane.showInputDialog("ID등록");
					String name = JOptionPane.showInputDialog("이름 등록");
					String ssn = JOptionPane.showInputDialog("주민번호 등록");
					String pass = JOptionPane.showInputDialog("비번 등록");
					member = new Member(id, name, ssn, pass);
					String info = member.info();
					JOptionPane.showMessageDialog(null, info);
					break;
				case "2":
					account = new Account(0);
					
					//파라미터와 아규먼트는 타입과 개수가 일치해야한다.
					break;
				case "3":
					String open = account.info(member.name);
					JOptionPane.showMessageDialog(null,open);
					break;
				case "4":
					String inputMoney = JOptionPane.showInputDialog("입금액");
					String message = account.deposit(Integer.parseInt(inputMoney));
					JOptionPane.showMessageDialog(null, message);
					break;
				case "5":
					String outputMoney = JOptionPane.showInputDialog("출금액");
					String message2 = account.withdraw(Integer.parseInt(outputMoney));
					JOptionPane.showMessageDialog(null, message2);
					break;
			}
		}
	}
}

