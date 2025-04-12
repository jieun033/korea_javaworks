package classes;

public class BookTest {

	public static void main(String[] args) {
		// 객체 배열 생성
		/* Book[] books = new Book[3];
		
		// 원소 추가(저장)
		books[0] = new Book(100, "채식주의자", "한강");
		books[1] = new Book(101, "작별하지 않는다", "한강");
		books[2] = new Book(102, "서랍에 저녁을 넣어두었다", "한강"); */
		
		// 객체 배열 생성 방법2 (콤마 주의)
		Book[] books = {
			new Book(100, "채식주의자", "한강"),
			new Book(101, "작별하지 않는다", "한강"),
			new Book(102, "서랍에 저녁을 넣어두었다", "한강")
		};
		
		// 특정 원소(요소) 출력
//		books[0].showBookInfo();
		
		// 전체 출력
		for (int i = 0; i < books.length; i++) {
			books[i].showBookInfo();
		}
	}

}
