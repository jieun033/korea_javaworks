package loop;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for문 (행, 열로 표현)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 직각 삼각형 모양의 별 만들기
		for (int i = 1; i <= 5; i++) { // 행
			for (int j = 1; j <= i; j++) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) { // 행
			for (int j = 1; j <= 6-i; j++) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//구구단 전체
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
		
	}

}
