package choice;

import java.util.Scanner;

public class IfElseEx1{

	public static void main(String[] args) {
	 
	Scanner scan = new Scanner(System.in);
	
	System.out.print("나이를 입력하세요:");
	int age = scan.nextInt(); //사용자 입력
	
	if(age >= 15) {
		System.out.println("관람가");
	}
	System.out.println("나이는" + age + "세 입니다.");
		
    
	 
	if(age >= 15) {
		System.out.println("관람가");
	}else {//else if(age <15)
		System.out.println("관람불가");
		
	}
	System.out.println("나이는" + age + "세 입니다.");
	
	scan.close(); //스캐너 닫기
	
	}
   
}
