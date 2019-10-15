package com.dxc.assessment.model;

public class QuestionsModel {


	private int serialnumbers;
	private String questions;
	private String answers;
	public int getSerialnumbers() {
		return serialnumbers;
	}
	public void setSerialnumbers(int serialnumbers) {
		this.serialnumbers = serialnumbers;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public QuestionsModel() {
		super();
		this.serialnumbers = 0;
		this.questions = null;
		this.answers = null;
	}
	public QuestionsModel(int serialnumbers, String questions, String answers) {
		super();
		this.serialnumbers = serialnumbers;
		this.questions = questions;
		this.answers = answers;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answers == null) ? 0 : answers.hashCode());
		result = prime * result + ((questions == null) ? 0 : questions.hashCode());
		result = prime * result + serialnumbers;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionsModel other = (QuestionsModel) obj;
		if (answers == null) {
			if (other.answers != null)
				return false;
		} else if (!answers.equals(other.answers))
			return false;
		if (questions == null) {
			if (other.questions != null)
				return false;
		} else if (!questions.equals(other.questions))
			return false;
		if (serialnumbers != other.serialnumbers)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "model [serialnumbers=" + serialnumbers + ", questions=" + questions + ", answers=" + answers + "]";
	}
	
}