package chap5;

public class MemberTest {

	public static void main(String[] args) {
		Member[] members = {
				new Member("정은하", "j1234"),
				new Member("김우주", "k0000"),
				new Member("박하늘", "p4320")
		};
		
		System.out.println("********* 회원 현황 *********");
		for (int i = 0; i < members.length; i++) {
			members[i].showMemberInfo();
		}
		System.out.println();
		
		// 향상된 for문
		// for (자료형 변수 : 배열 이름) { 변수 이름 출력 }
		for (Member member : members) {
			member.showMemberInfo();
		} // 순서가 없을 때 자주 씀
	}

}
