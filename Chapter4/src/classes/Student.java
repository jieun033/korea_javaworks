package classes;

/*
 클래스 정의
 클래스의 구성 요소 - 멤버 변수, 생성자(필수), 멤버 메서드
 */
public class Student {
	// 멤버 변수(속성)
	int studentId;
	String name;
	int grade;
	
	// 기본 생성자 - 클래스와 이름은 같고 반환값은 없음. (생략시 컴파일러가 자동으로 포함시켜줌.)
	public Student () {};
	
	// 매개변수가 있는 생성자
	// 생성자 오버로딩(중복) - 이름이 같고 매개변수가 다른 경우를 말함.
	public Student(int id, String n, int g) {
		studentId = id;
		name = n;
		grade = g;
	}
	
	// 멤버 메서드
	public void studentInfo () {
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println();
	}
}
