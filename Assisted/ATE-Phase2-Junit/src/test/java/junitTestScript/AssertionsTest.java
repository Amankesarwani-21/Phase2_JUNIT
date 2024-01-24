
package junitTestScript;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AssertionsTest {
	
	Calculator obj;
	
	@BeforeEach
	public void setup()
	{
		obj = new Calculator();
	}
	
	@Test
	public void Testadd()
	{
		int expectnumber = 40;
		int actualnumber = obj.add(2, 2);
		
		Assertions.assertEquals(expectnumber, actualnumber); // test will fail with assertion
		
		// give custom message with assertion method
	//	Assertions.assertEquals(expectnumber, actualnumber,"Sum is Incorrect..recheck the code");
	}
	
	@Test
	public void Testadd2()
	{
		int expectnumber = 40;
		int actualnumber = obj.add(2, 2);
		Assertions.assertNotEquals(expectnumber, actualnumber); // test will pass
	}
	
}
