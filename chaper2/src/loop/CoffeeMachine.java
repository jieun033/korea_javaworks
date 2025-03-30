package loop;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {

		int coffee = 5; //커피 총 수량
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("돈을 넣어주세요 : ");
			int money = scanner.nextInt();
			
			if(money == 500) {
				System.out.println("커피가 나옵니다.");
				coffee -= 1;
			} else if (money > 500) {
				System.out.println("거스름돈 " + (money - 500) + "원을 돌려주고 커피가 나옵니다.");
				coffee -= 1;
			} else {
				System.out.println("돈을 돌려주고 커피는 나오지 않습니다.");
			}
			
			System.out.println("남은 커피의 양은 " + coffee + "개입니다.");
			
			if (coffee == 0) {
				System.out.println("커피가 모두 소진되었으니 판매를 중단합니다.");
				break;
			}
		}
		scanner.close();
	}

}
