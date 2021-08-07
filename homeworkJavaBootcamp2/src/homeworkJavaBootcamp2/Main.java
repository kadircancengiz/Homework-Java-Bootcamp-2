package homeworkJavaBootcamp2;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("Kadircan");
		student.setHomeWork("Java React Bootcamp");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setCourse("C# Angular Bootcamp");
		
		User user = new User();
		user.setFirstName("Emir");
		
		UserManager userManager = new UserManager();
		User[] users = {student,instructor, user};
		userManager.addMultiple(users);
		
		System.out.println("---------------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student);
		
		System.out.println("---------------------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		
		
	}
}
