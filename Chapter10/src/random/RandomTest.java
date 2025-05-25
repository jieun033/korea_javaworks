package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 난수 생성
		int n1 = (int) (Math.random() * 2);
		System.out.println(n1);
		
		// Random() 클래스 활용
		Random rnd = new Random();
//		rnd.setSeed(0); // 시드값 설정 - 한 번만 난수 생성
//		System.out.println(rnd.nextInt());
		
		int n2 = rnd.nextInt(2);
		System.out.println(n2);
		
		// 동전 던지기
		int coin = rnd.nextInt(2) + 1; // 1-2
		if (coin == 1) {
			System.out.println("앞면");
		} else {
			System.out.println("뒷면");
		}
		
		System.out.println("*** 주사위 2개를 10번 던지기 ***");
		// 중복되면 "Double Thrown", 그 합이 7이면 "Seven Thrown", 10이면 "Ten Thrown"
		int dice1, dice2, total;
		
		for(int i = 1; i < 11; i++) {
			dice1 = rnd.nextInt(6) + 1;
			dice2 = rnd.nextInt(6) + 1;
			total = dice1 + dice2;
			System.out.println(total);
			if(total == 7) {
				System.out.println("Seven Thrown");
			} else if (total == 10) {
				System.out.println("Ten Thrown");
			} else if (dice1 == dice2) {
				System.out.println("Double Thrown");
			}
		}
	}

}
