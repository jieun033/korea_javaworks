package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// Set 타입으로 HashSet 객체 생성
		Set<String> set = new HashSet<>();
		
		// 요소 추가
		set.add("Java");
		set.add("Java"); // 중복 안 됨
		set.add("C++");
		set.add("Python");
		set.add("JDBC");
		
		// 객체 출력 - 순서가 없음
		System.out.println(set);
		
		// 객체의 크기
		int size = set.size();
		System.out.println("총 요소 수: " + size);
		
		// 특정 요소 검색 - 대소문자 구분함
		if(set.contains("JDBC")) {
			System.out.println("JDBD");
		}
		
		// 전체 요소 출력 - 순서가 없어 인덱싱 불가. 반복자 클래스 사용.
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) { // 요소가 있으면
			String element = ir.next(); // 요소 한 개 가져오기
			System.out.println("\t" + element);
		}
		System.out.println();
		
		// 요소 삭제
		if(set.contains("C++")) {
			set.remove("C++");
		}
		
		// 향상 for
		for(String element : set) {
			System.out.println("\t" + element);
		}

	}

}
