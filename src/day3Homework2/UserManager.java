package day3Homework2;

public class UserManager {

	public void Add(User user) {
		System.out.println(user.getUserId() + " userID sahibi " + user.getFirstName() + " " + user.getLastName() + " sisteme eklendi");
		
	}
	
	public void Update(User user) {
		System.out.println(user.getUserId() + " hesabi güncellendi ");
			
	}
	
	
}
