package com.without.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public class MySingletonBean {

	@Autowired
	MyPrototypeBean bean;
	
    public void showMessage(){
    	//MyPrototypeBean bean=getPrototypeBean();
        System.out.println("Hi, the time is "+bean.getDateTime());
    }
    /*
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MyPrototypeBean prototypeBean() {
        return new MyPrototypeBean();
    }
    
    @Lookup
     public MyPrototypeBean getPrototypeBean(){
     return  null;
    }
    */
}
