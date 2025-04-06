package methods;

public class ReturnMethods {
	// main() - 프로그램을 실행하는 함수
	public static void main(String[] args) {
		int value = square(8); // square() 호출
		double value2 = add(3.3, 2.54);
		String message = message();
		
		System.out.println(value); 
		System.out.println(value2); 
		System.out.println(message); 
	}
	
	// 제곱수를 계산하는 함수
	public static int square (int x) {
		return x * x; // 호출한 곳으로 값을 보내줌.
	}
	
	// 두 실수를 더하는 함수
	public static double add (double x, double y) { // 매개변수(parameter)는 없을 수도 있고, 여러 개가 올 수도 있다.
		return x + y;
	}
	
	// 메시지를 출력하는 함수
	public static String message() {
		return "생일 축하해요";
	}

}
