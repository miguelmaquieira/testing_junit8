package com.knowmad.testing.junit8.iloveyouboss.branchpersistance.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionControllerTest {
	private QuestionController controller;
	
	@Before
	public void create() {
		controller = new QuestionController();
		controller.deleteAll();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
