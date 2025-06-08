package users.run;

import java.util.List;

import users.domain.Users;
import users.domain.UsersDAO;

public class UsersTest {

	public static void main(String[] args) {
		Users user = new Users(); // Users 객체 생성
		UsersDAO dao = new UsersDAO(); // 관리 객체 생성
		
		user.setUserId("cloud");
		user.setUserPassword("a1234");
		user.setUserName("김길동");
		user.setUserAge(20);
		dao.insertUser(user);
		
		// 회원 수정
		Users renewUser = new Users();
		renewUser.setUserId("today");
		renewUser.setUserPassword("1234");
		renewUser.setUserName("이종범");
		renewUser.setUserAge(50);
		
		dao.updateUser(renewUser); // 수정 메서드 호출

		// 회원 삭제
		dao.deleteUser("cloud"); // 삭제 메서드 호출
		
		List<Users> userList = dao.getUserList();
		for (int i = 0; i < userList.size(); i++) {
			Users findUser = userList.get(i);
			System.out.println(findUser);
		}
		
		// 회원 상세 보기
		Users getUser = dao.getUser("korea");
		System.out.println(getUser);
	}
}
