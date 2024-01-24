package junitTestScript;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
public class ParametrizedTestMethodSource {
	
	
	public static Stream<String> stringParamters()
	{
		return Stream.of("Monday","Tuesday","Wednesday");
	}
	
	public static Stream<Integer> intParamters()
	{
		return Stream.of(100,200,300);
	}
	
	@ParameterizedTest(name = "Method value {arguments}")
	@MethodSource("stringParamters")
	public void getdatafromMethods(String input)
	{
		System.out.println("The value from String method is : " + input);
	//	System.out.println("The value from integer method is : " + input1);
	}
	
	@ParameterizedTest(name = "Method value {arguments}")
	@MethodSource("intParamters")
	public void getdatafromIntMethods(int input)
	{
		System.out.println("The value from Integer method is : " + input);
	
	}
	
}
