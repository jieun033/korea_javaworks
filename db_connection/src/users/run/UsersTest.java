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
		
		List<Users> userList = dao.getUserList();
		for (int i = 0; i < userList.size(); i++) {
			Users findUser = userList.get(i);
			System.out.println(findUser);
		}
	}
}
