package inheriting.bean;

public class JavaDeveloper {
	
	private String developerName;
	private String devloperTech;
	
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

	public JavaDeveloper(String developerName, String devloperTech) {
		super();
		this.developerName = developerName;
		this.devloperTech = devloperTech;
	}

	
	
}
