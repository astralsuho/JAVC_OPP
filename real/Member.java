package real;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Member {
		String name; //멤버변수
	
		public String bmi(double t,double w) {
			String bmi = "";
	        double bmi2 = w/(t*t)*1000;
	        if(bmi2>=40) {
	            bmi ="고도비만";
	            }else if(bmi2>=35) {
	                bmi = "중등도 비만";
	            }else if(bmi2>=30) {
	                bmi = "경도 비만";
	            }else if(bmi2>=25) {
	                bmi = "과체중";
	            }else if(bmi2>=18.5) {
	                bmi = "정상";
	            }else{
	                bmi = "저체중";
	            
	        }
			return bmi;
		} // bmi end
		
		// 로컬변수는 반드시 초기화 해야 한다.원치않는 값이 할당됨.
					/*
					국어, 영어, 수학, 과학, 사회 과목 점수를 입력 받아서 평균을 낸뒤
					100 ~ 90 A, B, C, D, E, F 를 내는 것
					 * */
		public String grade(int kor,int eng, int math,int scien,int society) {
			String grade=""; 
			int total = kor+eng+math+scien+society;
			int all = total/5; 
			
			if(all>=90){
				grade = "A";
			}else  if(all>=80) {
				grade = "B";
			}else if(all>=70){
				grade = "C";
			}else if(all>60){
				grade = "D";
			}else{
				grade = "F";
			}
			
			return grade;
		} //성적 프로그램 끝
		
		public String genderChecker(String ssn) {
			
			String checker = "";
			char ch = ssn.charAt(7);
			String result = ""; 
			
			switch(ch) {
			case '1' : result = "남" ;break;
			case '2' : result = "여" ;break;
			case '3' : result = "남" ;break;
			case '4' : result = "여" ;break;
			case '5' : result = "외국인" ;break;
			case '6' : result = "외국인" ;break;
			default : result = "다시 입력하여주세요";
			break;
			}
			
			return result;
		}
	}
