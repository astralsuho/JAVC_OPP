package phone;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		PhoneBean phone = null;  
		CelPhone celPhone = null;
		IponeBean iponeBean = null;
		AndroidPhoneBean aPhoneBean = null;
		
		while(true) {
				
			switch(JOptionPane.showInputDialog(
						"0.종료\n"
						+ "1.일반폰 2.휴대폰 3.아이폰.4.갤럭시노트")) {
			case "0":
				JOptionPane.showMessageDialog(null,
							"종료 ..");
				return;
			case "1":
				phone = new PhoneBean();
				String company = JOptionPane.showInputDialog("어느회사제품");
				String call = JOptionPane.showInputDialog("통화내용");
				String kind = JOptionPane.showInputDialog("종류");
				JOptionPane.showMessageDialog(null,phone.toString());
				phone.setCompany(company);
				phone.setCall(call);
				break;
				//종류 : 일반전화기
				//제조사 : 금성
				//통화내용 :안녕
			case "2" :
				celPhone = new CelPhone(); //상속을 받아준 것들은 위에서 스트링을 받아 지워줘도 된다.
				kind = JOptionPane.showInputDialog("핸드폰종류");
				company= JOptionPane.showInputDialog("핸드폰제조사");
				String move = JOptionPane.showInputDialog("이동가능여부");
				call =JOptionPane.showInputDialog("통화내용");
				celPhone.setCompany(company);
				celPhone.setCall(call);
				celPhone.setMove(move);
				celPhone.setKind(kind);
				JOptionPane.showMessageDialog(null,celPhone.toString());
				break;
				//종류: 핸드폰
				//제조사 : 모토로라 
				//이동성 : 이동가능
			case "3" :
				iponeBean = new IponeBean();
				kind = JOptionPane.showInputDialog("핸드폰종류");
				company= JOptionPane.showInputDialog("핸드폰제조사");
				move = JOptionPane.showInputDialog("이동가능여부");
				call =JOptionPane.showInputDialog("통화내용");
				String gum = JOptionPane.showInputDialog("노래검색");
				celPhone.setCompany(company);
				celPhone.setCall(call);
				celPhone.setMove(move);
				celPhone.setKind(kind);
				iponeBean.setDate(gum);
				JOptionPane.showMessageDialog(null,celPhone.toString());
				break;
				//종류: 핸드폰
				//제조사 : 모토로라 
				//이동성 : 이동가능
				//검색 : 노래검색
			case "4" :
				aPhoneBean = new AndroidPhoneBean();
				kind = JOptionPane.showInputDialog("핸드폰종류");
				company= JOptionPane.showInputDialog("핸드폰제조사");
				move = JOptionPane.showInputDialog("이동가능여부");
				call =JOptionPane.showInputDialog("통화내용");
				gum = JOptionPane.showInputDialog("노래검색");
				String display = JOptionPane.showInputDialog("큰화면");
				celPhone.setCompany(company);
				celPhone.setCall(call);
				celPhone.setMove(move);
				celPhone.setKind(kind);
				iponeBean.setDate(gum);
				aPhoneBean.setDisplay(display);
				JOptionPane.showMessageDialog(null,celPhone.toString());
				break;
 			}
				}
			}
		}
