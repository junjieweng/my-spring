package org.springframework.aop;


/**
 * 切点抽象
 *
 * @author jjewng
 * @date 2023/05/28
 */
public interface Pointcut {

	ClassFilter getClassFilter();

	MethodMatcher getMethodMatcher();
}
