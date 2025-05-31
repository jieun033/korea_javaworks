package typing;

import java.util.Random;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 영어 단어 문자열
		String str = "apple banana cow dirt example flower galaxy human idea jungle";
		
		// 영어 타자 게임
		int n = 1; // 문제 번호
		long start, end; // 시작, 종료 시간
		double elapsedTime; // 소요 시간
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[타자 게임], 준비되면 엔터> ");
		sc.nextLine();
		
		start = System.currentTimeMillis(); // 1970.1.1 자정 이후 밀리초(ms)로 계산
		
		while(n < 11) {
			System.out.println("문제: " + n);
			String[] word = str.split(" ");
			Random rnd = new Random();
			int rndIdx = rnd.nextInt(word.length);
			
			String question = word[rndIdx];
			System.out.println(question);
			
			String answer = sc.nextLine(); // 사용자 단어 입력
			
			// question과 answer 비교
			if (answer.equals(question)) {
				System.out.println("통과!");
				n++;
			} else {
				System.out.println("오타! 다시 도전!");
			}
		}
		end = System.currentTimeMillis();
		elapsedTime = (double)(end - start) / 1000; // ms -> s
		System.out.printf("게임 시간: %.2f초", elapsedTime);
		
		sc.close();
	}
}
