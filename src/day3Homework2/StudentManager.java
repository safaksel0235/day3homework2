package day3Homework2;

public class StudentManager extends UserManager{

	public void Start(Student student) {
		System.out.println(student.getTakenCourses()+ " kursu "+ student.getStudentNo()+ " ogrencı no'lu "+ 
	student.getFirstName()+" "+ student.getLastName()+" tarafından izlenmeye basladı. ");
		
	}
	
	public void Playlist(Student student) {
		System.out.println(student.getTakenCourses()+ " kursu playliste eklendi " );
	}
}
