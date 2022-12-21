package spring.method.factory.injection.example;

public class Developer {
	
	private String developerName;
	private String developerAddress;
	
	public static final Developer DEV=new Developer();
	
	private Developer() {
		super();
		System.out.println("This is the private constructor");
	}

	public static Developer returnObject()
	{
		System.out.println("Factory method called");
		return DEV;
	}
	
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

	
	
}
