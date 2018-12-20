package card2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CardBean sum = null;
		while(true) {
			
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.카드숫자종류2.TV정보보기")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
					String card1 = JOptionPane.showInputDialog("카드종류를 입력해 주세요");
					String card2 = JOptionPane.showInputDialog("카드번호를 입력해 주세요");
					sum = new CardBean();
					sum.setKind(card1);
					sum.setNum(Integer.parseInt(card2));
					break;
				case "2":
					String ss = sum.toString();
					JOptionPane.showMessageDialog(null,ss);
					
					
					
					// 제출한 카드의 스펙
					break;
			}
		}
	}
}