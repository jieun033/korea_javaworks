package statics;

public class HelloTest {

	public static void main(String[] args) {
		// 인스턴스형 (new해서 객체 생성)
		Hello greeting = new Hello();
		greeting.sayHello();
//		greeting.sayGoodBye(); static은 인스턴스로 하면 주의받음 (오류는 아님)
		
		// static형 메서드는 클래스 이름으로 직접 접근(new 하지 않음)
		Hello.sayGoodBye();
	}

}
