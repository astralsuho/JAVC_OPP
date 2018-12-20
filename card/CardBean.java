package card;

public class CardBean {
	private String kind; // 카드종류: 스페이드,다이아, 하트, 클로버
	private int number; //인스턴스 변수는 필드를 다 다님
	
	public void setKind(String kind) { //메소드
		this.kind = kind;//하나는 디스카인드 하나는 그냥 카드종족다름
	} 
	public String getKind() {
		return kind; //종료반환 리턴
	} 
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		String toString = "";
		return String.format("카드종류:%s카드번호:%d",kind,number );
		
	}
}