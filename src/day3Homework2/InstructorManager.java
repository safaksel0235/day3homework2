package day3Homework2;

public class InstructorManager extends UserManager{

	public void AddCourse(Instructor instructor) {
		System.out.println(instructor.getGivenCourses() +  " dersi "+ instructor.getFirstName()+" "+ instructor.getLastName() +" taraf�ndan sisteme eklendi ");
	}
	
	public void UpdateCourse(Instructor instructor) {
		System.out.println(instructor.getGivenCourses()+ " dersinin i�erigi g�ncellendi ");
		
		
	}

}
