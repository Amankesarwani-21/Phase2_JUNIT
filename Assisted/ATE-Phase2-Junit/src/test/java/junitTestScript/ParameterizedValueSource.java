package junitTestScript;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class ParameterizedValueSource {
	
	
	// passing test data to the test method
	// to pass test data to a Junit test cases is using annotation @Valuesource
	
	
	@ParameterizedTest(name= "{index} - Run the test")
	@ValueSource(ints = {11,12,13,14,15})
	public void valuesourcedemo(int value)
	{
		System.out.println(" the integer values" + value);
	}
	
	@ParameterizedTest(name= "{index} - Run the test for string value")
	@ValueSource(strings = {"abc","sonal","selenium"})
	public void valuesourcedemoString(String value)
	{
		System.out.println(" the String values" + value);
	}
}
