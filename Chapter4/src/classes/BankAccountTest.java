package classes;

public class BankAccountTest {

	public static void main(String[] args) {
		// BankAccount 객체 생성
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("222-333", "홍길동", 20);
		
//		account1.ano = "1111";
		account1.BankAccountInfo();
		account2.BankAccountInfo();
	}

}
