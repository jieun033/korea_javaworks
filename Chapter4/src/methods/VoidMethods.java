package methods;

public class VoidMethods {
	// 인사하는 기능의 함수를 정의
	public static void sayHello() {
		System.out.println("안녕하세요.");
	}
	
	public static void sayHello(String name) {
		System.out.print(name + "님은 우리 가게의 ");
	}
	
	public static void sayHello(int number) {
		System.out.println(number + "번째 손님입니다.");
	}
	
	public static void sayHello(char grade) {
		System.out.println(grade + "급 손님");
	}
	
	// main(괄호 속에 있는 건 매개변수) 함수
	public static void main(String[] args) {
		// 반환형(void)이 없는 함수
		sayHello(); // 함수 호출
		sayHello("태양");
		sayHello(1);
		sayHello('S');
	}

}
