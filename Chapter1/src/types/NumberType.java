package types;

public class NumberType {

	public static void main(String[] args) {
		System.out.println("***** 정수 자료형 *****");
		
		byte bData1 = 127;
		// byte bData2 = 128; 범위 초과로 에러
		
		System.out.println(bData1);
		
		int iNum1 = 2100000000;
		long lNum = 2200000009999992222l;
		
		System.out.println(iNum1);
		System.out.println(lNum);
		
		System.out.println("***** 실수 자료형 *****");
		
		float fNum = 4.123456f; // 소수 여섯번째 자리까지만 출력. 그 이상은 더블형으로~
		System.out.println(fNum);
		
		double dNum = 3.123456789012345; // 소수 열여섯째 자리까지 출력. 실수형에서는 더블이 표준!
		System.out.println(dNum);
	}

}
