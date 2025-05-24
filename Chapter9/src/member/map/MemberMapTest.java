package member.map;

import member.Member;

public class MemberMapTest {

	public static void main(String[] args) {
		// MemberHashMap 객체 생성
		MemberHashMap memberMap = new MemberHashMap();
		
		// 회원 추가
		memberMap.addMember(new Member(1001, "삼성전자"));
		memberMap.addMember(new Member(1002, "LG전자"));
		memberMap.addMember(new Member(1003, "Naver"));
		
		// 회원 목록 조회
		memberMap.showAllMember();
		System.out.println();
		
		// 회원 삭제
		memberMap.removeMember(1001);
		memberMap.removeMember(1004);
		
		memberMap.showAllMember();
	}

}
