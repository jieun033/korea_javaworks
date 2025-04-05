package chap3;

public class Sum100 {

	public static void main(String[] args) {
		int total = 0;
		for (int n = 1; n <= 100; n++) {
			total += n;
			if (total > 100) {
				System.out.println("n = " + n);
				break;
			}
		}
		System.out.println("sum = " + total);
	}

}

/*
	int n = 1;
	int sum = 0;

	while (true) {
		sum += n;
		if (sum > 100) break;
		n++;
	}
	System.out.println("n = " + n);
	System.out.println("sum = " + total);
*/