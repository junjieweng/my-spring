package org.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author jjewng
 * @date 2023/05/28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited
@Documented
public @interface Qualifier {

	String value() default "";

}