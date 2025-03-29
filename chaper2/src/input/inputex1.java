package input;

import java.util.Scanner;

public class inputex1 {

	public static void main(String[] args) {
		// 입력 처리 - scanner 클래스 사용
		//scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("당신의 이름은 무엇입니까?");
		String name = scanner.nextLine(); 
		System.out.println("당신의 이름은 " + name + "이군요!");
		
		System.out.print("당신의 나이는 몇 세입니까?");
		int age = scanner .nextInt(); //나이 입력
		System.out.println("당신의 나이는 " + age + "세 이군요!");
		
		
		//scanner 객체 종효 
		scanner . close();
		
	}

}
