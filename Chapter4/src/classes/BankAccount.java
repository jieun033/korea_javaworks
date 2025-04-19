package classes;

//은행 계좌 클래스 정의
// private - 접근 제어자 (내부 클래스만 접근 가능함.)
public class BankAccount {
	private String ano; // 계좌 번호
	private String owner; // 계좌주
	private int balance; // 잔고
	
	// 기본 생성자 (이게 퍼블릭이라 테스트에서 객체 생성 가능한 것.)
	public BankAccount() {}
	
	public BankAccount(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void BankAccountInfo() {
		System.out.println("계좌 번호: " + ano);
		System.out.println("계좌주: " + owner);
		System.out.println("잔고: " + balance);
	}
}
