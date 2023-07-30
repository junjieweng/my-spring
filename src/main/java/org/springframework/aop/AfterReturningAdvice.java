package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * 后置增强
 *
 * @author jjweng
 * @date 2023/05/28
 */
public interface AfterReturningAdvice extends AfterAdvice {

    void afterReturning( Object returnValue, Method method, Object[] args,  Object target) throws Throwable;
}
