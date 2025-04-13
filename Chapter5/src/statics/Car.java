package statics;

public class Car {
	// static이 붙은 변수(정적 변수)는 값을 공유 및 유지한다. (접근 제어자 뒤에 작성)
	private static int serialNumber = 1000; 
	private int carNumber; // 신차 번호
	
	public Car() {
		serialNumber++; // 번호가 1 증가
		carNumber = serialNumber;
	}
	
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	
	// 차량 번호 가져오기
	public int getCarNumber() {
		return carNumber;
	}
}
