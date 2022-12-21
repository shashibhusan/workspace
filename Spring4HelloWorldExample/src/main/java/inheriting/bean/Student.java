package inheriting.bean;

public class Student {
	
	private String studentName;
	private String studentAddress;
	private JavaDeveloper developer;

	public  void studentDetail()
	{
		System.out.println("This is the student detail");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public Student(String studentName, String studentAddress, JavaDeveloper developer) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.developer = developer;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public JavaDeveloper getDeveloper() {
		return developer;
	}

	public void setDeveloper(JavaDeveloper developer) {
		this.developer = developer;
	}


}
