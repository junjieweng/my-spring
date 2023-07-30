package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

	void before(Method method, Object[] args, Object target) throws Throwable;
}
