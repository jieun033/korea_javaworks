package methods;

public class MathEx {

	public static void main(String[] args) {
		// Math class의 주요 메서드 사용
		// 절대값
		int v1 = Math.abs(-10);
		System.out.println("v1 = " + v1);
		
		// 반올림 - long(8byte)
		long v2 = Math.round(6.8);
		System.out.println("v2 = " + v2);
		
		// 내림(버림)
		double v3 = Math.floor(1.9);
		System.out.println("v3 = " + v3);
		
		// 무작위(난수)  0.0 <= random < 1.0
		double rand = Math.random();
		System.out.println("random = " + rand);
		
		// 동전 던지기 - 앞면(0), 뒷면(1)
		double result = Math.random() * 2;
		System.out.println(result);
		
		int coin = (int)(Math.random() * 2);
		System.out.println(coin);
		
		if (coin == 0) {
			System.out.println("앞면: " + coin);
		} else {
			System.out.println("뒷면: " + coin);
		}
		
		// 주사위 눈 (1-6)
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
		
		// 주사위 10번 던지기
		System.out.println("== 주사위 10번 던지기 ==");
		for (int i = 1; i <= 10; i++) {
			dice = (int)(Math.random() * 6) + 1;
			System.out.println(dice);
		}
		
		// 문자열 랜덤 추출
		String[] word = {"나", "너", "우리", "우주"};
		
		System.out.println("배열의 크기: " + word.length);
		
		int randIdx = (int)(Math.random() * word.length);
		System.out.println(word[randIdx]);
	}

}
