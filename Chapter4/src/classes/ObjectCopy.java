package classes;

// 객체의 얕은 복사(ShallowCopy)
public class ObjectCopy {

	public static void main(String[] args) {
		// Book 객체 생성
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		// 객체 추가
		arr1[0] = new Book(100, "채식주의자", "한강"); 
		arr1[1] = new Book(101, "데미안", "헤르만 헤세"); 
		arr1[2] = new Book(102, "작별하지 않는다", "한강"); 
		
		// 객체 수정 - arr1의 첫 번째 요소 (arr1을 수정할시 arr2도 수정됨)
		arr1[0].setBookTitle("인간실격");
		arr1[0].setAuthor("다자이 오사무");
		
		// 향상된 for문 (클래스 이름 변수 이름 : 배열 이름) {변수 출력;}
		System.out.println("****** arr1 출력 ******");
		for (Book book : arr1) {
			book.showBookInfo();
		}
		System.out.println();
		
		// arr1을 arr2에 복사
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("****** arr2 출력 ******");
		for (Book book : arr2) {
			book.showBookInfo();
		}
	}

}
