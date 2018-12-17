package real;

import java.awt.CardLayout;
import java.util.Scanner;

import javax.swing.JOptionPane;

	public class Main {
		public static void main(String[] args) {
			while(true) {
				String menu = JOptionPane.showInputDialog(
						"0.종료\n "
						+ "1.회원관리 \n"
						+ "2.계산기 \n"
						+ "3.로또 \n"
						+ "4.달력 \n");
				switch(menu) {
				case "0":
					JOptionPane.showMessageDialog(null,"시스템 종료");
					return;
				case "1":
					Member m = new Member();
					String name = JOptionPane.showInputDialog("이름 입력");
					m.name = name;
					JOptionPane.showMessageDialog(null,
							String.format("환영합니다 %s 님", m.name));
					
					String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴] \n"
							+ "1. BMI(키, 몸무게) \n"
							+ "2. 학점(국어, 영어, 수학, 과학, 사회) \n"
							+ "3. 성별체크(SSN)");
					switch (mMenu) {
					case "1":
						String[] arr = JOptionPane.showInputDialog(null,
								"키,몸무게 입력").split(",");
						String bmi = m.bmi(Double.parseDouble(arr[0]), 
								Double.parseDouble(arr[1]));
						JOptionPane.showMessageDialog(null,
								String.format("%s 님은 %s 입니다.", 
										m.name,
										bmi));
										
						break;
					case "2":
						String[]arr2 = JOptionPane.showInputDialog
						(null,"국어, 영어, 수학, 과학, 사회 입력").split(",");
						String grade = m.grade(Integer.parseInt(arr2[0]),
								Integer.parseInt(arr2[1]),
								Integer.parseInt(arr2[2]),
								Integer.parseInt(arr2[3]),
								Integer.parseInt(arr2[4]));
						JOptionPane.showMessageDialog(null,String.format("%s는 %s 학점 입니다.",m.name,grade));
						
						break;
					case "3":
						String arr3 = JOptionPane.showInputDialog(null,"주민번호를 입력해 주세요"); //split(",");은복수일때만
						String gender = m.genderChecker(arr3);
						JOptionPane.showMessageDialog(null,String.format("%s %s",m.name,gender));
						break;

					default:
						break;
					}
				case "2":
					Calc calc = new Calc();
					String select =JOptionPane.showInputDialog(null,"1.계산기\n"
																		+ "2.구구단");
					switch(select) {
					case"1" :
						String[] op =JOptionPane.showInputDialog(null,"계산식을 입력해주세요.").split(" "); //스플릿을 굳이?
						switch(op[1]) { // 계산 + - *
						case "+":
							String res = calc.plus(Integer.parseInt(op[0]),Integer.parseInt(op[2]));//parse 문자를 숫자로 바꿔주는
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.", res));
						break;
						case "-":
							String res1 = calc.minus(Integer.parseInt(op[0]),Integer.parseInt(op[2]));//parse 문자를 숫자로 바꿔주는
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.", res1));
						break;
						case "*":
							String res2 = calc.multi(Integer.parseInt(op[0]),Integer.parseInt(op[2]));//parse 문자를 숫자로 바꿔주는
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.", res2));
						break;
						case "/":
							String res3 = calc.divid(Integer.parseInt(op[0]),Integer.parseInt(op[2]));//parse 문자를 숫자로 바꿔주는
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.", res3));
						break;
						case "%":
							String res4 = calc.mod(Integer.parseInt(op[0]),Integer.parseInt(op[2]));//parse 문자를 숫자로 바꿔주는
							JOptionPane.showMessageDialog(null,String.format("%s 입니다.", res4));
						break;
						}
						
						}
						
						
					
						
						
							
						
				
				
				
				
				
				}
				
			}
			
		}
	}