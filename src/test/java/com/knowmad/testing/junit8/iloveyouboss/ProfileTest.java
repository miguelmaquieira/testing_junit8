package com.knowmad.testing.junit8.iloveyouboss;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProfileTest {
	
	private Profile profile;
	private Question question;
	private Criteria criteria;
	
	@Before
	public void initialSetup() {
		profile = new Profile("Bull Hockey, Inc.");
		question = new BooleanQuestion(1, "Got bonuses?");
		criteria = new Criteria();
	}

	@Test
	public void test01_matches_MustMatchCriteriaNotMet_False() {
		// Arrange
		profile.add(new Answer(question, Bool.FALSE_VALUE));
		
		criteria.add(
					new Criterion(
							new Answer(question, Bool.TRUE_VALUE), 
							Weight.MUST_MATCH));
		
		// Act
		boolean matches = profile.matches(criteria);
		
		// Assert
		Assert.assertFalse(matches);
	}
	
	@Test
	public void test02_matches_DontCareCriteria_True() {
		// Arrange
		profile.add(new Answer(question, Bool.FALSE_VALUE));
		
		criteria.add(
					new Criterion(
							new Answer(question, Bool.TRUE_VALUE), 
							Weight.DONT_CARE));
		
		// Act
		boolean matches = profile.matches(criteria);
		
		// Assert
		Assert.assertTrue(matches);
	}
}
