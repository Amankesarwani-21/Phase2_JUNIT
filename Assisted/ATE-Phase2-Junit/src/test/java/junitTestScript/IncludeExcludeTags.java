package junitTestScript;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
public class IncludeExcludeTags {
	
	@Test
	@Tag("feature1")
	public void feature1Test1()
	{
		System.out.println("test 1 for feature1");
	}
	
	@Test
	@Tag("feature1")
	public void feature1Test2()
	{
		System.out.println("test 2 for feature1");
	}
	
	@Test
	@Tag("feature1")
	public void feature1Test3()
	{
		System.out.println("test 3 for feature1");
	}
	
	@Test
	@Tag("feature1")
	public void feature1Test4()
	{
		System.out.println("test 4 for feature1");
	}
	
	@Test
	@Tag("feature2")
	public void feature2Test1()
	{
		System.out.println("test 1 for feature2");
	}
	@Test
	@Tag("feature2")
	public void feature2Test2()
	{
		System.out.println("test 2 for feature2");
	}
	@Test
	@Tag("feature2")
	public void feature2Test3()
	{
		System.out.println("test 3 for feature2");
	}
}
