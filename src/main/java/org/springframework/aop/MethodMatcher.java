package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface MethodMatcher {

	boolean matches(Method method, Class<?> targetClass);
}
