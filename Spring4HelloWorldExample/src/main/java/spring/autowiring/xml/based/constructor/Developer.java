package spring.autowiring.xml.based.constructor;

public class Developer {
	
	private String developerName;
	private String developerAddress;
	JavaDeveloper javaDeveloper;
	DotNetDeveloper dotNetDeveloper;
	
	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	
	public String getDeveloperAddress() {
		return developerAddress;
	}

	public void setDeveloperAddress(String developerAddress) {
		this.developerAddress = developerAddress;
	}

	public JavaDeveloper getJavaDeveloper() {
		return javaDeveloper;
	}

	public void setJavaDeveloper(JavaDeveloper javaDeveloper) {
		this.javaDeveloper = javaDeveloper;
	}

	public DotNetDeveloper getDotNetDeveloper() {
		return dotNetDeveloper;
	}

	public void setDotNetDeveloper(DotNetDeveloper dotNetDeveloper) {
		this.dotNetDeveloper = dotNetDeveloper;
	}

	public  void developerDetail()
	{
		System.out.println("Name of the developer is : "+developerName+" from "+developerAddress);
	}

	public Developer(JavaDeveloper javaDeveloper) {
		super();
		this.javaDeveloper = javaDeveloper;
	}
	
	
}
