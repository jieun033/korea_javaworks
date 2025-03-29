package chap2;

public class Bread {

	public static void main(String[] args) {
		
		int bread = 25;
		int person = 4;
		int n = bread / person;
		int m = bread % person;
		
		System.out.println("각자의 몫 : " + n);
		System.out.println("남은 빵의 개수 : " + m);
	}

}
