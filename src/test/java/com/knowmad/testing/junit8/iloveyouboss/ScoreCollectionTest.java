package com.knowmad.testing.junit8.iloveyouboss;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import com.knowmad.testing.junit8.iloveyouboss.ScoreCollection;

public class ScoreCollectionTest {
	
	
	@Test
	public void answersArithmethicMeanOfTwoNumbers() {
		// Arrange
		ScoreCollection scores = new ScoreCollection();
		scores.add(() -> 7);
		scores.add(() -> 5);
		
		// Act
		int actualResult = scores.arithmeticMean();
		
		// Assert
		assertThat(actualResult, equalTo(6));
	}

}
