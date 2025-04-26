package statics;

public class MyMathTest {

	public static void main(String[] args) {
		// 수학 관련 클래스 제공받음
		// static을 포함한 메서드는 클래스 이름으로 직접 접근 (new 하지 않음)
		// 절대값 계산
		System.out.println("절대값: "+ Math.abs(-5));
		System.out.println("절대값: "+ MyMath.MyAbs(-5));
		
		// 거듭제곱 계산
		System.out.println("거듭제곱: " + Math.pow(2, 3));
		System.out.println("거듭제곱: " + MyMath.Mypow(2, 3));
		
		// 1부터 4까지 곱하기
//		int hap = 0;
//		for (int i = 0; i <= 4; i++) {
//			hap += i;
//		}
//		System.out.println("합계: " + hap);
//		
//		int gob = 1; // 곱하기 초기화 값은 1
//		for (int i = 1; i <= 4; i++) {
//			gob *= i;
//			// = 4!
//		}
//		System.out.println("합계: " + gob);
	}

}
