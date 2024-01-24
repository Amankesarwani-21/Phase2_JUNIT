package junitTestScript;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


// Running multiple junit classes
//@RunWith(Suite.class)
@SuiteClasses({junitTestScript.IncludeExcludeTags.class})
@IncludeTags({"feature1"})
public class Junit5Runner {
}
