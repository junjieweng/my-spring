package org.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author jjewng
 * @date 2023/05/28
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

	String value() default "singleton";
}
