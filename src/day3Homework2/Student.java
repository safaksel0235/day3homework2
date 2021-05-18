package day3Homework2;

public class Student extends User{

	private String takenCourses;
	private String studentNo;
	
	public Student(String firstName, String lastName, String userId, int age, String takenCourses, String studentNo) {
		super(firstName, lastName, userId, age);
		this.takenCourses = takenCourses;
		this.studentNo = studentNo;
	}

	
	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	
	
}
