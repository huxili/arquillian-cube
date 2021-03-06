package org.arquillian.cube.requirement;

import org.arquillian.cube.spi.requirement.Requires;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Requires(EnvironmentVariableRequirement.class)
public @interface RequiresEnvironmentVariable {

    String[] value() default {};
}
