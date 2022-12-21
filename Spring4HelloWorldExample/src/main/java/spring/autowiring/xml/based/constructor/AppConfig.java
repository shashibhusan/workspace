package spring.autowiring.xml.based.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;


@ImportResource("classpath:bean2.xml")
public class AppConfig {
  
    public static void main(String[] args) throws InterruptedException {
        @SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Developer developer=(Developer)context.getBean("d1");
        developer.getJavaDeveloper().detail();
    }
}
