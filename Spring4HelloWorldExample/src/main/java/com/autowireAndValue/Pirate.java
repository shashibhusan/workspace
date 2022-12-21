package com.autowireAndValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.autowireAndValue")
@PropertySource("propertiesFile.properties") // Use of @PropertySource annotation 
public class Pirate {
	private String name;
	private TreasureMap treasureMap;
	private Student student;
	private String empName;
	/*
	 Field injection Auto-wire
	 */
	@Autowired
	private Employee employee;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public TreasureMap getTreasureMap() {
		return treasureMap;
	}
	/*
	 Setter injection Auto-wire
	 */
	@Autowired   
	public void setTreasureMap(TreasureMap treasureMap) {
		this.treasureMap = treasureMap;
	}
	
	public Pirate() {
		 
	}
	/*
	 Constructor injection Auto-wired
	 Also use of @value annotation with Constructor injection
	 Note:-@Value will work only when it will be auto-wire
	 */
	@Autowired
	public Pirate(Student student,@Value("chandra bhusan patel")String name) {
		super();
		System.out.println(" :: Parameteric constructor called :: ");
		this.student = student;
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}
	public Employee getEmployee() {
		return employee;
	}

	public String getEmpName() {
		return empName;
	}
     
	@Autowired
	@Value("${emp.name}") // Getting the value from properties resource 
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
}
