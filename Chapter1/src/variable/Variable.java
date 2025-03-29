package variable;

public class Variable {

	public static void main(String[] args) {
		// 변수는 자료를 저장하기 위한 공간이다. 자료를 변경할 수 있다.
		String name; // 자료형이 문자인 name이란 변수를 선언
		int grade; // 정수형 변수를 선언
		int ban = 4; // 변수 선언과 동시에 초기화해도 된다.
		
		name = "유재석"; // 변수에 값을 저장(초기화)
		grade = 3;
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + ban);
		
		/*
		 * 변수 이름 선언시
		 * 1. 숫자로 시작하면 안 된다.
		 * 2. 공백문자가 들어가면 안 된다.
		 * 3. 예약어를 사용하면 안 된다. (e.g. int class;)
		 */
	}

}
