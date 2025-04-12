package constant;

public class ConstantEx {

	public static void main(String[] args) {
		// 상수 - 대문자(관레)
		final int MIN_NUM = 0;
		final int MAX_NUM = 100;
		
//		MIN_NUM = 1; 에러. 변경 불가.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// 원의 넓이 계산하기
		final double PI = 3.1415;
		int radius = 5;
		double area = PI * radius * radius;
		
		System.out.printf("원의 넓이: %.2f", area);

	}

}
