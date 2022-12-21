package ModelAttributeExample;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class Student {

	private String  studentName;
	private String studentHobby;
	private ArrayList<String>skill;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public ArrayList<String> getSkill() {
		return skill;
	}
	public void setSkill(ArrayList<String> skill) {
		this.skill = skill;
	}
	
}
