package reference.score;

public class ScoreMain {

	public static void main(String[] args) {
		// 학생 객체 생성
		Student jung = new Student(1001, "정하성");
		Student kim = new Student(1002, "김기려");
		
		// 과목 설정
		jung.setKoreanSubject("국어", 90);
		jung.setMathSubject("수학", 94);
		kim.setKoreanSubject("국어", 98);
		kim.setMathSubject("수학", 100);
		
		// 학생 정보 출력
		jung.showStudentInfo();
		kim.showStudentInfo();
	}

}
