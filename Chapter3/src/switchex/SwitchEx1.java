package switchex;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("메달 색깔을 입력하세요: ");
		String medalColor = scanner.nextLine();
		
		switch(medalColor) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		scanner.close();
	}

}
