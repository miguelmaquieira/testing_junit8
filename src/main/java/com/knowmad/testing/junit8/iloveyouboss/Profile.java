package com.knowmad.testing.junit8.iloveyouboss;

import java.util.HashMap;
import java.util.Map;

public class Profile {
	
	private Map<String, Answer> answers = new HashMap<>();
	private int score;
	private String name;
	
	public Profile(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int score() {
		return score;
	}
	
	public boolean matches(Criteria criteria) {
		score = 0;
		
		boolean kill = false;
		boolean anyMatches = false;
		for (Criterion criterion: criteria) {
			Answer answer = answers.get(criterion.getAnswer().getQuestionText());
			
			boolean match = criterion.getWeight() == Weight.DONT_CARE || answer.match(criterion.getAnswer());
			if (!match && criterion.getWeight() == Weight.MUST_MATCH) {
				kill = true;
			}
			if (match) {
				score += criterion.getWeight().getValue();
			}
			anyMatches |= match;
 		}
		
		if (kill) { return false; }

		return anyMatches;
	}
	
	public void add(Answer answer) {
		answers.put(answer.getQuestionText(), answer);
	}

}
