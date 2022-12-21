package com.beanAndQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

@Configuration 
@ComponentScan("com.beanAndQualifier")
public class ConfigurationClass {
	private String name;
	private Student student;
	
	@Autowired
	private BarFormatter barFormatter;
	
	@Autowired
	private SimpleFormatter simpleFormatter;
	
	@Autowired
	@Qualifier("barFormatter")
	private Formatter formatter;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	@Bean(name="configuration")
	public ConfigurationClass getConfiguration() {
		
		return new ConfigurationClass();
	}
	
	public void display() {
		
		System.out.println("This is the display method of the ConfigurationClass");
	}
	
	@Bean  // Use of simple @Bean annotation
	@DependsOn("studentBean") // mean "studentBean" bean will initialize first then this bean.
	public Employee getEmployee() {
		
		System.out.println("ConfigurationClass.getEmployee()");
		
		return new Employee();
	}
  
	@Bean(name="studentBean") //This is the use of @Bean with name
    public Student getBean() {
		System.out.println("ConfigurationClass.student");
    	return new Student();
	}
	
	public Formatter getFormatter() {
		return formatter;
	}
	public void setFormatter(Formatter formatter) {
		this.formatter = formatter;
	}
	
	public BarFormatter getBarFormatter() {
		return barFormatter;
	}
	public void setBarFormatter(BarFormatter barFormatter) {
		this.barFormatter = barFormatter;
	}
	public SimpleFormatter getSimpleFormatter() {
		return simpleFormatter;
	}
	public void setSimpleFormatter(SimpleFormatter simpleFormatter) {
		this.simpleFormatter = simpleFormatter;
	}
	
	
	
}
