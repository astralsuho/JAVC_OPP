package car;

public class CarBean {
	private String color, gearType;
	private int door; // 문의 갯수
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	} 
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getGearType() {
		return gearType;
	}
	public void setDoor(int door) {
		this.door = 0;
	}
	public int getDoor() {
		return 0;
	}
}