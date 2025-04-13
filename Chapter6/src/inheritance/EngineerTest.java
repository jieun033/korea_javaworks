package inheritance;

public class EngineerTest {

	public static void main(String[] args) {
		// Engineer 객체 생성 
		Engineer e1 = new Engineer();
		e1.name = "김철수"; // Person 멤버변수에 접근 가능
		e1.age = 21;
		e1.companyId = 111;
	}

}
