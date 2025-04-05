package chap3;

public class ArrayTest {

	public static void main(String[] args) {
		
		int number[] = {2, 4, 6, 8, 10};
		// == int number[] = new int[] {2, 4, 6, 8, 10};
		
		int total = 0;
		double avg;
		
		for (int i = 0; i < number.length; i++) {
			total += number[i];
		}
		
		avg = total / number.length;
		System.out.println("총합: " + total);
		System.out.println("평균: " + avg);
	}

}
