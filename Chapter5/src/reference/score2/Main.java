package reference.score2;

public class Main {

	public static void main(String[] args) {
		// 학생 객체 생성
		Student jung = new Student(1001, "정하성");
		Student kim = new  Student(1002, "김기려");
		
		// 과목 추가
		jung.addSubject("국어", 90);
		jung.addSubject("수학", 94);
		jung.addSubject("과학", 89);
		
		kim.addSubject("국어", 98);
		kim.addSubject("수학", 100);
		kim.addSubject("과학", 100);
		
		// 정보 출력
		jung.displayInfo();
		kim.displayInfo();
	}

}
