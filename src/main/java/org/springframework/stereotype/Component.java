package org.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @author jjewng
 * @date 2023/05/28
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

	String value() default "";
}