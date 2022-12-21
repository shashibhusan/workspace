package inheriting.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;


@ImportResource("classpath:bean2.xml")
public class AppConfig {
  
    public static void main(String[] args) throws InterruptedException {
        @SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student=(Student)context.getBean("student");
        System.out.println("========"+student.getDeveloper().getDeveloperName());
        System.out.println("========"+student.getDeveloper().getDevloperTech());
    }
}
