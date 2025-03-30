package arrays;

public class ArrayString {

	public static void main(String[] args) {
		String[] cars = {"소나타", "EV3", "BMW"};
		
		System.out.println("배열의 길이 : " + cars.length);
		
		//특정 인덱스 검색(선택)
		System.out.println(cars[2]);
		
		//인덱스 변경
		cars[1] = "Ionic6";

		//전체 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
	}

}
