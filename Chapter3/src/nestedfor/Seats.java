package nestedfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입장객 수: ");
		int customer = scanner.nextInt();
		System.out.print("좌석 열의 수: ");
		int column = scanner.nextInt();
		int row;
		
		if (customer % column == 0) {
			row = customer / column;
		} else {
			row = customer / column + 1;
		}
		
		System.out.println();
		
		for (int i = 0; i < row; i++) {
			for (int j = 1; j <= column; j++) {
				int seat = i*column + j;
				if (seat > customer) break; //for문 탈출
				System.out.print("좌석" + seat + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
