package homeworkJavaBootcamp2;

public class Student extends User {
	private String homeWork;

	public Student() {

	}

	public Student(int id, String firstName, String lastName, String email, String password, String homeWork) {
		super(id, firstName, lastName, email, password);
		this.homeWork = homeWork;
	}

	public String getHomeWork() {
		return homeWork;
	}

	public void setHomeWork(String homeWork) {
		this.homeWork = homeWork;
	}

	
}
