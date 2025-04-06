package classes;

public class StudentTest {

	public static void main(String[] args) {
		// 클래스의 인스턴스(객체) 생성
		Student s1 = new Student(); // s1 객체 생성
		Student s2 = new Student(1001, "이이", 2);
		
		s1.studentId = 1000;
		s1.grade = 3;
		s1.name = "신사임당";
		
		// 학생 정보
		s1.studentInfo();
		s2.studentInfo();
		
		// 객체 출력
		// 클래스 이름: 패키지이름.클래스이름
		System.out.println(s1);
		System.out.println(s2);
	}

}
