package nestedfor;

public class ForForEx {

	public static void main(String[] args) {
		// 중첩 for, 5행 5열
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 연속된 숫자로 5행 5열 채우기
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				int num = i*5 + j;
				if (num > 23)
					break;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
