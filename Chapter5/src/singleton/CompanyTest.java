package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// Company 객체 생성
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		// 두 변수는 같은 주소를 가진다 (true 출력)
		System.out.println(company1 == company2);
		System.out.println(company1);
		System.out.println(company2);

	}

}
