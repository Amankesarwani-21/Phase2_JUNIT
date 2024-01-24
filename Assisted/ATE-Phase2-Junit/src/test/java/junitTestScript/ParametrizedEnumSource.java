package junitTestScript;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
public class ParametrizedEnumSource {
	
	
	String str = "Selenium";
	
	// values = variable name of type enum
	// Values is an Enum object
	
	enum Values{
		SELENIUM, JMETER, POSTMAN
	}
	
	@ParameterizedTest(name = "Enum value {arguments}") // stores the values {SELENIUM, JMETER, POSTMAN}
	@EnumSource(Values.class)
	public void TestParametrizedEnumSource(Object value)
	{
		System.out.println(value.toString());
	}
}
