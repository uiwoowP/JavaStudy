package javatest;

public class Member {
	String userId;
	String name;
	int age;
	
	public Member() {
		this.name = "홍길동";
		this.userId = "user01";
		this.age = 100;
	}
	
	public Member(String name, String userId, int age) {
		this.name = name;
		this.userId = userId;
		this.age = age;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("이름: %s 아이디: %s 나이 %d ", this.name, this.userId, this.age);
	}

}
