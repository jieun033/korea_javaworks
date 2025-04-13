package salestatement;

public class Alcohol extends Drink {
	private float alcper; // 알콜 도수

	Alcohol(String name, int price, int quantity, float alcper) {
		super(name, price, quantity);
		this.alcper = alcper;
	}
	
	// 메서드 재정의
	static void printTitle() { // 제목행 출력
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}

	// 메서드 재정의
	@Override
	void printData() {
		System.out.println(name + "(" + alcper + ")\t" + price + "\t" + quantity + "\t" + calcPrice());
	}
	
}
