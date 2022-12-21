package com.dependency.injection;

public class MarksDetail {

	private String subjectOneName;
	private int subjectOneMarks;
	
	private String subjectTwoName;
	private int subjectTwoMarks;
	
	private String subjectThreeName;
	private int subjectThreeMarks;
	public String getSubjectOneName() {
		return subjectOneName;
	}
	public void setSubjectOneName(String subjectOneName) {
		this.subjectOneName = subjectOneName;
	}
	public int getSubjectOneMarks() {
		return subjectOneMarks;
	}
	public void setSubjectOneMarks(int subjectOneMarks) {
		this.subjectOneMarks = subjectOneMarks;
	}
	public String getSubjectTwoName() {
		return subjectTwoName;
	}
	public void setSubjectTwoName(String subjectTwoName) {
		this.subjectTwoName = subjectTwoName;
	}
	public int getSubjectTwoMarks() {
		return subjectTwoMarks;
	}
	public void setSubjectTwoMarks(int subjectTwoMarks) {
		this.subjectTwoMarks = subjectTwoMarks;
	}
	public String getSubjectThreeName() {
		return subjectThreeName;
	}
	public void setSubjectThreeName(String subjectThreeName) {
		this.subjectThreeName = subjectThreeName;
	}
	public int getSubjectThreeMarks() {
		return subjectThreeMarks;
	}
	public void setSubjectThreeMarks(int subjectThreeMarks) {
		this.subjectThreeMarks = subjectThreeMarks;
	}
	public MarksDetail(String subjectOneName, int subjectOneMarks, String subjectTwoName, int subjectTwoMarks,
			String subjectThreeName, int subjectThreeMarks) {
		super();
		this.subjectOneName = subjectOneName;
		this.subjectOneMarks = subjectOneMarks;
		this.subjectTwoName = subjectTwoName;
		this.subjectTwoMarks = subjectTwoMarks;
		this.subjectThreeName = subjectThreeName;
		this.subjectThreeMarks = subjectThreeMarks;
	}
	
	
	
}
