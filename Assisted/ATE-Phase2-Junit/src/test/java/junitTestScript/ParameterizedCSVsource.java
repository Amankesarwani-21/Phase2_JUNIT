package junitTestScript;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ParameterizedCSVsource {
	
	@ParameterizedTest(name = "Methodsource {arguments}")
	@CsvSource({
		"Tool_name, version",
		"Selenium , v4",
		"Postman  , v2",
		"Jmeter   , v5",
		"TestNG   , v7"
	})
	public void csvsourcemethod(String value1, String value2)
	{
		System.out.println(value1 + " : " + value2);
	}
	

	

}