package junitTestScript;

import java.lang.annotation.Annotation;
public class CustomAnnotationDemo implements MetaAnotation{
	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
	@MetaAnotation
	public void testdemo()
	{
		System.out.println("My annotation testing");
	}
	
}
