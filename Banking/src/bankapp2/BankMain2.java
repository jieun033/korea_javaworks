package bankapp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bankapp.BankAccount;

public class BankMain2 {
		// BankAccount 객체를 저장할 자료 구조 - ArrayList 사용
		static List<BankAccount> accountList = new ArrayList<>();
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
		}
		scan.close();
	}

	// 계좌 검색
	private static BankAccount findAccount(String ano) {
		BankAccount account = null;
		for(int i = 0; i < accountList.size(); i++)  {
			// 계좌 번호 비교 - 이미 저장된 계좌 번호를 가져옴
			String dbAno = accountList.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountList.get(i); // 계좌 객체를 가져옴.
				break;
			}
		}
		return account;
	}
	
	// 출금
	private static void withdraw() {
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
	
	// 예금
	private static void deposit() {
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

	// 계좌 목록
	private static void getAccountList() {
		for (int i = 0; i < accountList.size(); i++) {
			BankAccount account  = accountList.get(i); // account 객체를 가져와서 저장
			System.out.print("계좌 번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner() + "\t");
			System.out.print("잔액: " + account.getBalance() + "\n");
		}
	}

	// 계좌 생성
	private static void createAccount() {
		System.out.println("=================================================");
		System.out.println("계좌 생성");
		System.out.println("=================================================");
		
		while (true) {
			System.out.print("계좌 번호: ");
			String ano = scan.nextLine(); // 계좌 입력
			
			if(findAccount(ano) != null) { // 계좌가 이미 저장되어있다면
				System.out.println("이미 등록된 계좌입니다. 다시 입력해주세요.");
			} else {
				System.out.print("계좌주: ");
				String owner = scan.nextLine();
		
				System.out.print("초기 입금액: ");
				int balance = Integer.parseInt(scan.nextLine());
		
				// 신규 계좌 생성
				BankAccount newAccount = new BankAccount(ano, owner, balance);
				accountList.add(newAccount);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
}
