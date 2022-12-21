package spring.autowiring.xml.based.byName;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;


@ImportResource("classpath:bean2.xml")
public class AppConfig {
  
    public static void main(String[] args) throws InterruptedException {
        @SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        JavaDeveloper developer=(JavaDeveloper)context.getBean("j3");
        System.out.println("========>>"+developer.getStudent1().getStudentAddress());
    }
}
