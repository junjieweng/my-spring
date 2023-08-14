package org.springframework.aop.support;

import org.springframework.aop.Pointcut;

/**
 * @author jjweng
 * @date 2023/8/14
 */
public interface ExpressionPointcut extends Pointcut {
    String getExpression();
}
