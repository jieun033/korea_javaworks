package classes;

// 객체의 깊은 복사(Deep Copy)
public class ObjectCopy2 {

	public static void main(String[] args) {
		// Book 객체 생성
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
				
		// arr1에 객체 추가
		arr1[0] = new Book(100, "채식주의자", "한강"); 
		arr1[1] = new Book(101, "데미안", "헤르만 헤세"); 
		arr1[2] = new Book(102, "작별하지 않는다", "한강");
		
		// arr2 객체 생성(기본 생성자)
		arr2[0] = new Book();
		arr2[1] = new Book();
		arr2[2] = new Book();
		
		// arr1을 arr2에 복사(깊은 복사)
		for (int i = 0; i < arr1.length; i++) {
			arr2[i].setBookNumber(arr1[i].getBookNumber());
			arr2[i].setBookTitle(arr1[i].getBookTitle());
			arr2[i].setAuthor(arr1[i].getAuthor());
		}
		
		// arr1 첫 번째 요소 수정 (arr1만 수정, arr2는 수정 안 됨)
		arr1[0].setBookTitle("인간실격");
		arr1[0].setAuthor("다자이 오사무");
		
		// 향상된 for문 (클래스 이름 변수 이름 : 배열 이름) {변수 출력;}
		System.out.println("****** arr1 출력 ******");
		for (Book book : arr1) {
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("****** arr2 출력 ******");
		for (Book book : arr2) {
			book.showBookInfo();
		}
	}

}
