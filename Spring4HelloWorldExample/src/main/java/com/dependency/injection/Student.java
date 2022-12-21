package com.dependency.injection;

public class Student {
	
	private String studentName;
	private String studentAddress;
	private MarksDetail detail;
	private Question question;
	private Quiz quiz;
	
	public MarksDetail getDetail() {
		return detail;
	}

	public void setDetail(MarksDetail detail) {
		this.detail = detail;
	}

	public  void studentDetail()
	{
		System.out.println("This is the student detail");
	}
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	

	public Student(String studentName, String studentAddress, MarksDetail detail, Question question, Quiz quiz) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.detail = detail;
		this.question = question;
		this.quiz = quiz;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	
	

}
