package chap4;

public class MyAbs {
	
	// 절대값 계산
	public static int myAbs(int x) {
		if (x < 0) 
			return -x;
		else
			return x;
	}

	public static void main(String[] args) {
		int x1 = myAbs(-4);
		int x2 = myAbs(4);
		System.out.println("myAbs(-4) = " + x1);
		System.out.println("myAbs(4) = " + x2);
	}

}
