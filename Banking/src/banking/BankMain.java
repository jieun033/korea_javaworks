package banking;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// 은행 업무 프로그램 - 예금, 출금, 잔액조회
		Scanner scanner = new Scanner(System.in);
		boolean run = true; // 상태 변수(스위칭 변수)
		int balance = 0; // 잔고
		
		while (run) {
			// 메뉴 화면 만들기
			System.out.println("=====================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액 조회 | 4. 종료");
			System.out.println("=====================================");
			System.out.print("선택> ");
			
			int selectNum = scanner.nextInt();
			int amount = 0; // 예금액, 출금액
			
			switch (selectNum) {
			case 1:
				System.out.print("예금액> ");
				amount = scanner.nextInt();
				balance += amount;
				System.out.println("정상 입금되었습니다. 현재 잔액: " + balance + "원");
				break;
			case 2:
				System.out.print("출금액> ");
				amount = scanner.nextInt();
				
				if (amount > balance) {
					System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
				} else {
					balance -= amount;
					System.out.println("정상 출금되었습니다. 현재 잔액: " + balance + "원");
				}
				break;
			case 3:
				System.out.println("잔액> " + balance + "원");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false; // run 상태 변경
				break;
			default:
				System.out.println("메뉴를 잘못 눌렀습니다. 다시 입력해주세요.");
			}
		}
		scanner.close();
	}

}
