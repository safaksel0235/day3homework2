package day3Homework2;


public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student("safak", "selcuk", "98765",27, "c#", "13016007");
		Instructor instructor1 = new Instructor("Engin", "Demirog","11111" , 30, "50711111", "Software", "java", "engindemirog@outlook.com");
		
		
			
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		UserManager userMananager = new UserManager();	
		
		userMananager.Add(instructor1);
		userMananager.Update(instructor1);
		instructorManager.AddCourse(instructor1);
		instructorManager.UpdateCourse(instructor1);
		userMananager.Add(student1);
		userMananager.Update(student1);
		studentManager.Start(student1);
		studentManager.Playlist(student1);
		
	}

}
