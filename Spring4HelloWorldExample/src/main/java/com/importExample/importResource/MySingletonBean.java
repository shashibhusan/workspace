package com.importExample.importResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(com.importExample.importResource.Student.class) // This is the use of Import Annotation
/*
if i will remove this annotation then i need to declare Student class as '@Component'
means
We can use specific @Configuration classes without component scanning with this annotation
*/
public class MySingletonBean {
	@Autowired
	Student  student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
   
	
}
