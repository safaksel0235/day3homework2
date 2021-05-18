package day3Homework2;

public class User {

	private String firstName;
	private String lastName;
	private String userId;
	private int age;
	
	public User(String firstName, String lastName, String userId, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.age = age;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
	
	
	
	
}
