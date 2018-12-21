package phone;

public class CelPhone extends PhoneBean{ // 셀폰이 자식이고 폰빈이 부모인가?
	private String move;
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	public String toString() {
		return String.format("종류:%s\n"
				+ "제조사 :%s\n"
				+ "이동성:%s\n"
				+ "통화내용: %s",
			super.getKind(),
			super.getCompany(),
			move,
			super.getCall());
	}//
}
