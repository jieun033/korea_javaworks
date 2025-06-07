package users.domain;

// Users 클래스(자료형) - DTO(Data Transfer Object) 정의
public class Users {
	private String userId; // 아이디
	private String userPassword; // 비밀번호
	private String userName; // 이름
	private int userAge; // 나이
	
	// getter, setter 메서드
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + ", userAge="
				+ userAge + "]";
	}

	
	
	
}
