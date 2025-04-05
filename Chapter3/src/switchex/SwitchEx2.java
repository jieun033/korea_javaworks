package switchex;

import java.util.Scanner;

public class SwitchEx2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/* 31 - 1, 3, 5, 7, 8, 10, 12
		 * 30 - 4, 6, 9, 11
		 * 28 - 2
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();
		int day = 0;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("1부터 12까지의 수를 입력하세요.");
			return;
		}
		System.out.println(month + "월은 " + day + "일까지 있습니다.");
		scanner.close();
	}

}
