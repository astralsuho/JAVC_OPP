package card;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CardBean bean = null;
		while(true) {
			
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.카드선택 2.TV정보보기")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
					String card1 = JOptionPane.showInputDialog("카드 종류를 입력해 주세요");// 카드의 종류 
					String card2 = JOptionPane.showInputDialog("카드 번호를 입력해 주세요");// 카드의 종류 
					 bean = new CardBean(); // 
					bean.setKind(card1);
					bean.setNumber(Integer.parseInt(card2));
					break;
				case "2":
					
					String jung = bean.toString();
					JOptionPane.showMessageDialog(null,jung);
					
					// 제출한 카드의 스펙
					break;
			}
		}
	}
}