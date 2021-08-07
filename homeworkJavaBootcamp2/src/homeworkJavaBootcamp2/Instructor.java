package homeworkJavaBootcamp2;

public class Instructor extends User {
	private String course;

	public Instructor() {

	}

	public Instructor(int id, String firstName, String lastName, String email, String password, String course) {
		super(id, firstName, lastName, email, password);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
