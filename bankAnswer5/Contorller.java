package bankAnswer5;

import java.security.cert.PKIXRevocationChecker.Option;

import javax.swing.JOptionPane;

public class Contorller {
	public static void main(String[] args) {
		AccountBean bean = null;
		MemberBean memberBean = null;
		AccountService accountService = new AccountServiceImpl();
		MemberService memberService = new MemberService(); {
		};	
		
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
												+ "1.회원가입\n"
												+ "2.계좌개설")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				JOptionPane.showInputDialog("ID를 등록해주세요");
				JOptionPane.showInputDialog("이름을 알려주세요");
				JOptionPane.showInputDialog("주민등록번호를 입력해주세요");
				JOptionPane.showInputDialog("패스워드를 입력해 주세요");
				break;
			case "2" :
				
			}
		}
	}
}
