package com.knowmad.testing.junit8.iloveyouboss;

public enum Bool {
	
	FALSE(0),
	TRUE(1);
	
	public static final int FALSE_VALUE = 0;
	public static final int TRUE_VALUE = 1;
	
	private int value;
	
	private Bool(int value) { this.value = value; }
	
	public int getValue() { return this.value; };

}
