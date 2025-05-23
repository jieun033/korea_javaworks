package exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// 클래스의 이름을 잘못 입력한 경우 예외
		// 컴파일러가 예외를 알려주는 것 - 컴파일 에러
		try {
			Class.forName("java.lang.String");
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace(); // 이건 에러가 아니고 너 잘못 입력했다고 파일 찾을 수 없다고 알려주는 거임
		}

	}

}
