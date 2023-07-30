package org.springframework.aop;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface PointcutAdvisor extends Advisor {

	Pointcut getPointcut();
}
