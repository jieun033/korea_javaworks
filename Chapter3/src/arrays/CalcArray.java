package arrays;

public class CalcArray {

	public static void main(String[] args) {
		// 정수형 배열을 생성하고 연산
		// 합계와 총점
		int[] score = new int[] {75, 90, 80, 60}; // ==  int[] score = {75, 90, 80, 60};
		int sum = 0;
		float avg;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = (float)sum / score.length;
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + avg);
		
		// printf() 대응 서식 %d - 정수 / %f - 실수 / %s - 문자
		System.out.printf("average = %.1f\n", avg);
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		
		// 최대값, 최소값
		int max;
		max = score[0]; //배열의 첫 번째 값을 최대값으로 설정
		
		for (int i = 0; i < score.length; i++) { // 반복문을 순회하면서
			if (score[i] > max) { // 요소값과 최대값을 비교해서
				max = score[i]; // 큰 값을 최대값으로 저장
			}
		}
		System.out.println("max = " + max);
	}

}
