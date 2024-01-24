package junitTestScript;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
public class MydynamicTestDemo2 {
	
	@TestFactory
	public Stream<DynamicTest> generatedynamicTest()
	{
		
		return Stream.of("pop","mom","madam","dad","mam")
				.map(inputText ->
				DynamicTest.dynamicTest(inputText,
					() -> Assertions.assertTrue(Myutils.isPalindrome(inputText)))
							
						);
				


	}
}
