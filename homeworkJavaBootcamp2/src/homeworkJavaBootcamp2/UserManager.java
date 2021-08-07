package homeworkJavaBootcamp2;

public class UserManager {

	public void add(User user) {
		System.out.println("User Added " + user.getFirstName());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}

	}
}
