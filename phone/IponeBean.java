package phone;

public class IponeBean extends CelPhone{
 private String date;
 public void setDate (String date) {
	 this.date = date;
	 }
 public String getDate() {
	 return date;
 }
 
 public String toString() {
		return String.format("종류:%s\n"
				+ "제조사 :%s\n"
				+ "이동성:%s\n"
				+ "통화내용: %s\n"
				+ "검색 :%s",
			super.getKind(),
			super.getCompany(),
			super.getMove(),
			
			super.getCall());

 	}
 }
