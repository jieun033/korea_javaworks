package generic.box;

public class Car {
	// default 멤버 변수 - 같은 패키지에선 접근 가능, 다른 패키지에선 접근 불가
	String name; // 모델명
	
	public Car(String name) {
		this.name = name;
	}

	// 객체의 문자열 정보 반환
	@Override
	public String toString() {
		return name;
	}
	
}
