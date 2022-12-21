package com.importExample.importResource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackageClasses = MySingletonBean.class)
@ImportResource("classpath:bean.xml")
public class AppConfig {
  
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MySingletonBean bean = context.getBean(MySingletonBean.class);
        bean.getStudent().studentDetail();
        System.out.println("\n-----------------------");
        Employee eObject =(Employee)context.getBean("e1");
        context.close();  
        eObject.display();
        System.out.println("Employee Name : "+eObject.getName());
        System.out.println("Employee Address : "+eObject.getAddress());
    }
}
