package chap2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		String a = (num % 2 == 0) ? "은(는) 짝수입니다." : "은(는) 홀수입니다.";
		System.out.println("입력한 " + num + a);
		
		scanner.close();
	}

}
