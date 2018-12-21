package tv;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		while(true) {
			
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.TV작동 2.TV정보보기")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
					String brand = JOptionPane.showInputDialog("TV브랜드를 입력해 주세요");//brand,color,price 입력함 
					String color = JOptionPane.showInputDialog("원하시는 TV색상을 입력해 주세요");
					String price = JOptionPane.showInputDialog("");
					// TV브랜드
					// TV색상
					// 가격
					break;
				case "2":
					// 구입한 TV 스펙
					break;
			}
		}
	}
}