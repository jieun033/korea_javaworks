package chap4;

public class MyMathTest {

	public static void main(String[] args) {
		// MyMath 클래스의 객체 생성
//		MyMath math = new MyMath();
//		int value1 = math.abs(-4);
		int value1 = MyMath.abs(-4); // static 붙으면 new 없이 직접 접근
		System.out.println(value1);
		
		// 자바에서 제공하는 Math 사용
		int value2 = Math.abs(-4);
		System.out.println(value2);
		
		// square() 호출
		int value3 = MyMath.square(4);
		System.out.println(value3);
	}

}
