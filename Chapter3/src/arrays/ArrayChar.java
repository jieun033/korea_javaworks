package arrays;

public class ArrayChar {

	public static void main(String[] args) {
		// 알파벳 대문자 저장 (26개)
		char ch = 'A';
		//ch = (char) (ch + 1);
		// = ch++;
		
		char[] alphabets = new char[26];
		/* alphabets[0] = ch;
		ch++;
		alphabets[1] = ch;
		System.out.println(alphabets[1]); */
		System.out.println("배열의 길이: " + alphabets.length);
		
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}

}
