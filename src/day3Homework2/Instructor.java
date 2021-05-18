package day3Homework2;

public class Instructor extends User{

	private String phone;
	private String department;
	private String givenCourses;
	private String email;
	
	public Instructor(String firstName, String lastName, String userId, int age, String phone, String department,
			String givenCourses, String email) {
		super(firstName, lastName, userId, age);
		this.phone = phone;
		this.department = department;
		this.givenCourses = givenCourses;
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
