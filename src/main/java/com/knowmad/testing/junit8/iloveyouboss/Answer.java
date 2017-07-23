package com.knowmad.testing.junit8.iloveyouboss;

public class Answer {
	
	private int i;
	private Question question;
	
	public Answer(Question question, int i) {
		this.i = i;
		this.question = question;
	}
	
	public Answer(Question question, String matchingValue) {
		this.i = i;
		this.question = question;
	}
	
	public String getQuestionText() {
		return question.getText();
	}
	
	public boolean match(int expected) {
		return question.match(expected, i);
	}

	public boolean match(Answer otherAnswer) {
		return question.match(i, otherAnswer.i);
	}

	public Question getCharacteristic() {
		return question;
	}

}
