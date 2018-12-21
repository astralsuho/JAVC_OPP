package phone;

public class PhoneBean {
	/**
	 * ****/
	
	private String company, call, kind;
	
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	public void setCall(String call) {
		this.call =call;
	}
	public String getCall() {
		return call;
	}
	public void setKind(String kind) {
		this.kind= kind;
	}
	public String getKind() {
		return kind;
	}
	
	public String toString() {
		return String.format("종류:%s\n"
				+ "제조사 :%s\n"
				+ "통화내용:%s");
	}
}
	