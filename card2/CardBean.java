package card2;

public class CardBean {
	String kind;
	int num;
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	} 
	public String toString() {
		return String.format("카드종류:%s카드번호:%d",kind,num);
	}
	

	
}