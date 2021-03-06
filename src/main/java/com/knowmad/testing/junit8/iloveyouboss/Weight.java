package com.knowmad.testing.junit8.iloveyouboss;

public enum Weight {
	
	MUST_MATCH(Integer.MAX_VALUE),
	VERY_IMPORTANT(5000),
	IMPORTANT(1000),
	WOULD_PREFER(100),
	DONT_CARE(0);
	
	private int value;
	
	private Weight(final int value) {
		this.value = value;
	}
	
	public int getValue() { return this.value; }

}
