package org.testclasses;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.Instant;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Property {
String name();
String format() default "dd.MM.yyyy tt:mm";
}
