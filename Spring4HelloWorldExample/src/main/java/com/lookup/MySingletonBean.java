package com.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class MySingletonBean {
MyPrototypeBean bean;
    public void showMessage(){
    	MyPrototypeBean bean=getPrototypeBean();
        System.out.println("Hi, the time is "+bean.getDateTime());
    }
 
    @Lookup
     public MyPrototypeBean getPrototypeBean(){
     return  null;
    }
}
