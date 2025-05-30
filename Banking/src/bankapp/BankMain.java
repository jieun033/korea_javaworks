package bankapp;

import java.util.Scanner;

public class BankMain {
	// BankAccount 객체 배열 백 개 생성
	static BankAccount[] accounts = new BankAccount[100];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true; // 프로그램의 실행과 종료 상태 변수
		
		while (sw) {
			System.out.println("=================================================");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("=================================================");
			System.out.print("선택> ");
			
			// 선택 메뉴는 문자를 정수형으로 변환
			int selctNum = Integer.parseInt(scan.nextLine());
			
			switch (selctNum) {
			case 1:
				createAccount();
				break;
			case 2:
				getAccountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				sw = false;
				break;
			default:
				System.out.println("지원하지 않는 기능입니다. 다시 입력해주세요.");
				break;
			}
		} // while() 닫기
		scan.close();
	} // main() 닫기

	private static BankAccount findAccount(String ano) {
		BankAccount account = null; // 객체 초기화
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				// 이미 배열에 저장된 계좌 가져옴
				String dbAno = accounts[i].getAno();
				if(dbAno.equals(ano)) { // 외부에서 입력한 계좌와 이미 저장된 계좌가 일치하면
					account = accounts[i]; // 그 객체를 저장해서 반환함
					break;
				}
			}
		}
		return account;
	}
	
	private static void withdraw() {
		// 출금
		System.out.println("=================================================");
		System.out.println("출금");
		System.out.println("=================================================");
		
		System.out.print("계좌 번호: ");
		String ano = scan.nextLine();
		
		System.out.print("출금액: ");
		int amount = Integer.parseInt(scan.nextLine());
		
		if (findAccount(ano) != null) { // 일치되는 계좌 번호가 있으면
			BankAccount account = findAccount(ano); // 계좌 객체 생성
			if (amount > account.getBalance()) {
				System.out.println("잔액이 부족합니다.");
			} else {
				// 출금 = 잔고 - 입금액
				account.setBalance(account.getBalance() - amount);
				System.out.println("결과: 정상 출금되었습니다.");
				System.out.println("현재 잔액: " + account.getBalance());
			}
		} else {
			System.out.println("결과: 일치하는 계좌가 없습니다. 다시 입력해주세요.");
		}
	}
	
	private static void deposit() {
		// 예금
		System.out.println("=================================================");
		System.out.println("예금");
		System.out.println("=================================================");
		
		System.out.print("계좌 번호: ");
		String ano = scan.nextLine();
		
		System.out.print("입금액: ");
		int amount = Integer.parseInt(scan.nextLine());
		
		if (findAccount(ano) != null) { // 일치되는 계좌 번호가 있으면
			BankAccount account = findAccount(ano); // 계좌 객체 생성
			// 예금 = 잔고 + 입금액
			account.setBalance(account.getBalance() + amount);
			System.out.println("결과: 정상 입금되었습니다.");
			System.out.println("현재 잔액: " + account.getBalance());
		} else {
			System.out.println("결과: 일치하는 계좌가 없습니다. 다시 입력해주세요.");
		}
	}

	private static void getAccountList() {
		// 계좌 목록
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) { // 배열에 값이 있는 경우만 출력
				System.out.print("계좌 번호: " + accounts[i].getAno() + "\n");
				System.out.print("계좌주: " + accounts[i].getOwner() + "\n");
				System.out.print("잔액: " + accounts[i].getBalance() + "\n");
				System.out.println();
			}
		}
	}

	private static void createAccount() {
		// 계좌 생성
		System.out.println("=================================================");
		System.out.println("계좌 생성");
		System.out.println("=================================================");
		
		System.out.print("계좌 번호: ");
		String ano = scan.nextLine(); // 계좌 입력
		
		System.out.print("계좌주: ");
		String owner = scan.nextLine();
		
		System.out.print("초기 입금액: ");
		int balance = Integer.parseInt(scan.nextLine());
		
		// 첫 번째 위치에 계좌 생성
//		accounts[0] = new BankAccount(ano, owner, balance);
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) { // 배열의 요소가 비어있는 경우 새 계좌 생성
				accounts[i] = new BankAccount(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
		
	}

}
