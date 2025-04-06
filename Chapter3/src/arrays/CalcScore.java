package arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		boolean run = true; //프로그램 시작과 종료 - 스위치 변수
		int studentNum = 0;
		int[] scores = null; // 점수 저장 배열, 배열일 때는 null로 초기화해준다.
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("======================================================");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("======================================================");
			System.out.print("선택> ");
			int menu = scanner.nextInt(); 
			switch (menu) {
			case 1:
				System.out.print("학생 수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; //점수를 저장할 배열 생성
				break;
			case 2:
				if (scores != null) { // 배열이 null이 아닐 때 수행.
					for(int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]> ");
						scores[i] = scanner.nextInt(); //점수 입력
					}
				}
				break;
			case 3:
				if (scores != null) {
					for(int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "] = " + scores[i]);
					}
				}
				break;
			case 4:
				if (scores != null) {
					int sum = 0;
					double avg;
					int max;
					max = scores[0]; // 요소의 첫 번째 값을 최대값으로 설정
					
					for (int i = 0; i < scores.length; i++) {
						sum += scores[i];
						if (scores[i] > max) { // 점수가 최대값보다 크면
							max = scores[i]; // 최대값에 점수를 저장
						}
					}
					avg = (double)sum / scores.length;
					System.out.printf("평균 점수 : %.1f\n", avg);
					System.out.println("최고 점수 : " + max);
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 입력하세요.");
				break;
			}
		}
		scanner.close();
	}

}
