package hello;

public class PrintData {

	public static void main(String[] args) {
		// 데이터에는 숫자(정수, 실수), 문자가 있다.
		// 숫자
		System.out.println(100);
		System.out.println(3.3);
		
		// 문자
		System.out.println('A'); // 한 개의 문자는 홑따옴표('')를 사용
		System.out.println('가'); 
		System.out.println("apple"); // 여러 개의 문자(문자열)은 쌍따옴표("") 사용
		
		// 연산
		System.out.println(2+2);
		System.out.println(2-4.5);
		System.out.println(2*4.5);
		System.out.println(2.0/4.0);
		
		// 블리언(Boolean) - 결과가 참 또는 거짓으로 나오는 자료형
		System.out.println(4 < 5);
		System.out.println(4 > 5);
		System.out.println(true);
		
	}

}
