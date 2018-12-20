package gms1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원정보\n"
					+ "2.회원가입")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료");
				return;
			
		}
	}
	}
}
