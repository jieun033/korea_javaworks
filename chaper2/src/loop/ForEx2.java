package loop;

public class ForEx2 {

	public static void main(String[] args) {
		char ch; // 전역 변수(전체에 영향을 끼치는 변수)
		// ch = 65 -> A
		// ch = (char)(ch + 1); -> B
		// 아스키코드
		for(ch = 65; ch < 123; ch++) {
			System.out.print(ch + " ");
		} 
		System.out.println();
		// 유니코드
		for(ch = 12593; ch < 12686; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		// 구구단
		for(int dan = 1; dan < 10; dan++) {
			for(int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}	
		}
	}

}
