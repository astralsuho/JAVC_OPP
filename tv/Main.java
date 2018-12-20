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
					//brand,color,price 입력함 
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