package interfaces.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// 부모 타입으로 객체 생성
		Queue shelfQueue = new BookShelf();
		
		// 요소 넣기
		shelfQueue.enQueue("삼국유사");
		shelfQueue.enQueue("삼국사기");
		shelfQueue.enQueue("삼국지");
		
		// 요소의 수
		System.out.println("요소의 총 개수: " + shelfQueue.getSize());
		
		// 요소 삭제
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
