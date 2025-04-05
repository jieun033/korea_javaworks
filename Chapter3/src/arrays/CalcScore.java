package arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		boolean run = true; //프로그램 시작과 종료 - 스위치 변수
		int studentNum = 0;
		int[] scores = null; // 점수 저장 배열
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
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt(); //점수 입력
				}
				break;
			case 3:
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] = " + scores[i]);
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
