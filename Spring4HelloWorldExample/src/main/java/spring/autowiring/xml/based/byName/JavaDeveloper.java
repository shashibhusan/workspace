package spring.autowiring.xml.based.byName;

public class JavaDeveloper {
	
	private String developerName;
	private String devloperTech;
	private Student student1;
	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public String getDevloperTech() {
		return devloperTech;
	}

	public void setDevloperTech(String devloperTech) {
		this.devloperTech = devloperTech;
	}
	
	public  void developerDetail()
	{
		System.out.println("java developer");
	}

	public Student getStudent1() {
		return student1;
	}

	public void setStudent1(Student student1) {
		this.student1 = student1;
	}

	
	
}
