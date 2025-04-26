package string;

public class StringMethods {

	public static void main(String[] args) {
		// charAt(인덱스) - 문자열에서 한 개의 문자 추출
		// 문자열은 특별한 1차원 배열이다.
		String msg = "행운을 빌어요!";
		
		char ch = msg.charAt(4);
		System.out.println(ch);
		
		// 주민등록번호에서 남녀를 구분
		// 7번째 문자가 1, 3일시 남 / 2, 4일시 여
		String jumin = "020202-2123456";
		char gender = jumin.charAt(7); // 성별을 저장하는 변수
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		// substring(시작 인덱스, 끝 인덱스) - 여러 개의 문자열 잘라내기(추출하기)
		// substring(index) - 인덱스부터 끝까지 추출
		// 주민등록번호의 앞 부분 - firstNum, 뒤 - secondNum
		String firstNum = jumin.substring(0, 6); // (끝 인덱스 - 1) 을 추출
		System.out.println("생년월일: " + firstNum);
		
		String secondNum = jumin.substring(7);
		System.out.println("주민번호 뒷자리: " + secondNum);
	}
}
