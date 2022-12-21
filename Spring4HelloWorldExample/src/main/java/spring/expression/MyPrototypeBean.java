package spring.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("prototypeBean")
public class MyPrototypeBean {
	@Value("shashi bhusan patel")
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showMessage(){
        System.out.println("This is the showMessage of MyPrototypeBean");
    }
	
	public String returnAddress(){
        
		return "shashi bhusan patel,Piluee, Bahadura, Ballia (UP) 277207";
    }
}
