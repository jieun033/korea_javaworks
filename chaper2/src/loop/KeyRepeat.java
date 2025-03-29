package loop;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요? (y/n) : ");
			String key = scanner.nextLine();
			
			if (key.equals("y")) {
				System.out.println("계속 반복합니다.");
			} else if (key.equals("n")) {
				System.out.println("반복을 중단합니다.");
				break;
			} else {
				System.out.println("키를 잘못 눌렀습니다. 다시 입력하세요.");
			} 
		}
		System.out.println("프로그램을 종료합니다.");
		
		scanner.close();
	}

}
