package org.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface Advisor {

	Advice getAdvice();

}
