package lianxi;

import java.security.cert.PKIXRevocationChecker.Option;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		Member member = null;//에어리어
		while(true) {
			switch(JOptionPane.showInputDialog("0.정지\n"
					+"1.회원가입\n"
					+"2.계좌개설\n"
					+"3.계좌보기")) {
			
			case "0" : 
				JOptionPane.showMessageDialog(null,"종료");
			return;
			
			case "1" : 
				String id = JOptionPane.showInputDialog("ID");
				String name = JOptionPane.showInputDialog("이름을 입력해 주세요");
				String ssn = JOptionPane.showInputDialog("신분증 번호를 입력해 주세요");
				String pass = JOptionPane.showInputDialog("패스워드");
				member = new Member(id,name,ssn,pass);//아규먼트
				String info = member.info();//불러오기
				JOptionPane.showMessageDialog(null,info);//출력하기
			case "2" :
				
			}
		}
	}
}
