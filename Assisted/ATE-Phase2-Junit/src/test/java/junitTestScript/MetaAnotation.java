package junitTestScript;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
// We have to create our custom Annotation
//1. Where will this annotation be used/targeted
@Target({ElementType.TYPE, ElementType.METHOD})
//2. When will the custom annotation be triggered
@Retention(RetentionPolicy.RUNTIME)
//3. Tag the annotation
@Tag("dev")
@Test  // our custom annotation is replica of @Test annotation
public @interface MetaAnotation {
}
