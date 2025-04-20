package objects;

public class BookTest {

	public static void main(String[] args) {
		// String 객체 생성
		String name = new String("한강");
//		String name = "한강"; 위와 똑같음. 메모리가 달라지는 것뿐이다.
		System.out.println(name);
		System.out.println(name.toString());
		
		// Book 객체 생성
		Book book = new Book(100, "채식주의자");
		System.out.println(book);
	}

}
