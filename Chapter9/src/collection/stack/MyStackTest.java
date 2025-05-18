package collection.stack;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		// 요소 넣기 - 순서(0-강, 1-고, 2-노)
		stack.push("강아지");
		stack.push("고양이");
		stack.push("노루");
	
		// 요소의 개수
		System.out.println("요소의 총 개수: " + stack.getSize());
		
		// 요소 삭제 - 순서(2-노, 1-고, 0-강)
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
