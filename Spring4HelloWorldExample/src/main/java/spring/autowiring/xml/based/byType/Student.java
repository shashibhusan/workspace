package spring.autowiring.xml.based.byType;

public class Student {
	
	private String studentName;
	private String studentAddress;

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

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

}
