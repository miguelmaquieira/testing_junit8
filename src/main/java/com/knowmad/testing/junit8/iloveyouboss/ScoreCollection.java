package com.knowmad.testing.junit8.iloveyouboss;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
	
	private List<Scorable> scores = new ArrayList<Scorable>();
	
	public void add(Scorable score) {
		scores.add(score);
	}
	
	public int arithmeticMean() {
		int total = scores.stream().mapToInt(Scorable::getScore).sum();
		return total/ scores.size();
	}

}
