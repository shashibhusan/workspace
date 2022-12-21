package spring.expression;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component("youCanDefineBeanNameHereAlsoPleaseNote")
public class MySingletonBean {

	@Autowired
	MyPrototypeBean bean;
	//This is how conditional operator will be used in SPEL
	// Use of Arithmetic , Relational & Logical operator is explained in "Theory file".
	@Value("#{prototypeBean.name != null ? prototypeBean.name : 'default'}")
	private String name;
	
	private int age;
	@Value("#{prototypeBean.returnAddress()}")  // This how we call a method using SPEL
	private String address;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showMessageDetail(){
        System.out.println("This is the showMessage of MySingletonBean");
    }
	
   // @Bean(name="prototypeBean")
	public MyPrototypeBean getBean() {
		return bean;
	}

	public void setBean(MyPrototypeBean bean) {
		this.bean = bean;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
    
}
