package string;

public class StringMethods2 {

	public static void main(String[] args) {
		// indexOf와 lastIndexOf
		
		String url = "http://www.korea_it.kr/custom/boards";
		// 첫 인덱스부터 검색해서 매개로 전달된 문자(열)을 찾음
		int n1 = url.indexOf("/");
		System.out.println(n1); // 5
		
		int n2 = url.lastIndexOf("/");
		System.out.println(n2); // 29
		
		String path = url.substring(n2);
		System.out.println(path); // n2(29)부터 끝까지 출력 = /boards
		
//		toUpperCase() - 대문자로 변환
//		toLowerCase() - 소문자로 변환
//		equals() - 문자열의 일치 여부 (대소문자 구분)
//		equalsIgnoreCase() - 문자열의 일치 여부 (대소문자 구분 안 함)
		
		String str1 = "Hello, World!";
		String str2 = "HELLO, WORLD!";
		
		if(str1.equals(str2)) {
			System.out.println(str1.toUpperCase());
		} else if(str1.equalsIgnoreCase(str2)) {
			System.out.println(str1.toLowerCase());
		} else {
			System.out.println(str2);
		}
		
//		split(구분 기호) - 문자열을 구분 기호로 구분하여 배열로 반환함
		
		String carts = "potato strawberry garlic";
		String[] array = carts.split(" "); // carts를 공백문자로 구분
		
		System.out.println(array[0]);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// 향상된 for문
		for (String a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		String str = "1,2,3,4,5,6,7,8,9";
		String[] array2 = str.split(",");
		
		System.out.println(array2[0]);
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]);
			if ((i + 1) % 3 == 0) {
				System.out.println();
			}
		}
			
	}

}
