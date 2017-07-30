package com.knowmad.testing.junit8.iloveyouboss.branchpersistance.domain;

public class Criterion implements Scorable {
	
	private int score;
	private Answer answer;
	private Weight weight;
	
	public Criterion(Answer answer, Weight weight) {
		this.answer = answer;
		this.weight = weight;
	}
	
	public Weight getWeight() { return this.weight; }
	public Answer getAnswer() { return this.answer; }

	public void setScore(int score) { this.score  = score; }
	public int getScore() { return this.score; }
}
