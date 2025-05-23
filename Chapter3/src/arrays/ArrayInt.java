package arrays;

public class ArrayInt {

	public static void main(String[] args) {
		// 배열 - 여러 개의 연속된 자료를 저장하는 자료 구조
		// 배열의 길이가 4인 정수형 배열 선언
//		int[] number = new int[4];
		
		//0번 인덱스 접근(조회)
		//System.out.println(number[2]);
		
		//전체 조회
/*		for(int i = 0; i < 4; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println(); 
		
		//요소 저장
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		*/
		
		int number[] = {10, 20, 30, 40, 50}; // 배열의 선언과 동시에 초기화(입력)
		
		// 배열의 크기(길이)
		System.out.println("배열의 길이: " + number.length);
		
		// 요소 수정
		number[2] = 100; // 100을 대입하면 수정됨.
		
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		} 
		System.out.println();
		
		//연산
		System.out.println(number[0] + number[1]);
		
		//전체 합계
		int total = 0;
		for(int i = 0; i < number.length; i++) {
			total += number[i];
		} 
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + ((double)total / number.length));
	}

}
