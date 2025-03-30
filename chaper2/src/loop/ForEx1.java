package loop;

public class ForEx1 {

	public static void main(String[] args) {
		
		//1-10 나열
		for (int n = 1; n <= 10; n++) {
			System.out.print(n + " ");
		}
		System.out.println(); // 줄 바꿈
		
		// 1-10 합계
		int total = 0;
		double avg;
		int n; // 반복 횟수 변수(전역 변수)
		
		for (n = 1; n <= 10; n++) { // 블럭 안에(괄호 안에) 있으면 지역 변수, 밖에 있으면 전역 변수
			total += n;
		}
		avg = (double)total / (n-1);
		System.out.println("합계: " + total);
		System.out.println("평균: " + avg);
	}

}
