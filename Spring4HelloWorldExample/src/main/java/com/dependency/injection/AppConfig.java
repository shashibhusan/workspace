package com.dependency.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;


@ImportResource("classpath:bean.xml")
public class AppConfig {
  
    public static void main(String[] args) throws InterruptedException {
        @SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student=(Student)context.getBean("s1");
        System.out.println("========"+student.getStudentName());
        System.out.println("========"+student.getStudentAddress());
        System.out.println("========"+student.getDetail().getSubjectThreeName());
        System.out.println("========"+student.getDetail().getSubjectThreeMarks());
        student.getQuestion().displayInfo();
        student.getQuiz().displayInfo();
    }
}
