package org.springframework.test.aop;

import org.junit.Before;
import org.junit.Test;

import org.springframework.aop.AdvisedSupport;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.TargetSource;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.aop.framework.CglibAopProxy;
import org.springframework.aop.framework.JdkDynamicAopProxy;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import org.springframework.test.common.WorldServiceAfterReturnAdvice;
import org.springframework.test.common.WorldServiceBeforeAdvice;
import org.springframework.test.service.WorldService;
import org.springframework.test.service.WorldServiceImpl;

import java.lang.reflect.Method;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public class DynamicProxyTest {

	private AdvisedSupport advisedSupport;

	@Before
	public void setup() {
		WorldService worldService = new WorldServiceImpl();
		advisedSupport = new ProxyFactory();
		// Advisor 是 Pointcut 和 Advice 的组合
		String expression = "execution(* org.springframework.test.service.WorldService.explode(..))";
		AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
		advisor.setExpression(expression);
		AfterReturningAdviceInterceptor methodInterceptor = new AfterReturningAdviceInterceptor(
                (returnValue, method, args, target) -> System.out.println("AfterAdvice: do something after the earth explodes")
        );
		advisor.setAdvice(methodInterceptor);
		TargetSource targetSource = new TargetSource(worldService);
		advisedSupport.setTargetSource(targetSource);
		advisedSupport.addAdvisor(advisor);
	}

	@Test
	public void testJdkDynamicProxy() throws Exception {
		WorldService proxy = (WorldService) new JdkDynamicAopProxy(advisedSupport).getProxy();
		proxy.explode();
	}

	@Test
	public void testCglibDynamicProxy() throws Exception {
		WorldService proxy = (WorldService) new CglibAopProxy(advisedSupport).getProxy();
		proxy.explode();
	}

	@Test
	public void testProxyFactory() throws Exception {
		// 使用 JDK 动态代理
		ProxyFactory factory = (ProxyFactory) advisedSupport;
		factory.setProxyTargetClass(false);
		WorldService proxy = (WorldService) factory.getProxy();
		proxy.explode();

		// 使用 CGLIB 动态代理
		factory.setProxyTargetClass(true);
		proxy = (WorldService) factory.getProxy();
		proxy.explode();
	}

	@Test
	public void testBeforeAdvice() throws Exception {
		// 设置 BeforeAdvice
		String expression = "execution(* org.springframework.test.service.WorldService.explode(..))";
		AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
		advisor.setExpression(expression);
		MethodBeforeAdviceInterceptor methodInterceptor = new MethodBeforeAdviceInterceptor(
                (method, args, target) -> System.out.println("BeforeAdvice: do something before the earth explodes")
        );
		advisor.setAdvice(methodInterceptor);
		advisedSupport.addAdvisor(advisor);
		ProxyFactory factory = (ProxyFactory) advisedSupport;
		WorldService proxy = (WorldService) factory.getProxy();
		proxy.explode();
	}

	@Test
	public void testAdvisor() throws Exception {
		WorldService worldService = new WorldServiceImpl();

		// Advisor 是 Pointcut 和 Advice 的组合
		String expression = "execution(* org.springframework.test.service.WorldService.explode(..))";
		AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
		advisor.setExpression(expression);
		MethodBeforeAdviceInterceptor methodInterceptor = new MethodBeforeAdviceInterceptor(
				(method, args, target) -> System.out.println("BeforeAdvice: do something before the earth explodes")
		);
		advisor.setAdvice(methodInterceptor);

		ClassFilter classFilter = advisor.getPointcut().getClassFilter();
		if (classFilter.matches(worldService.getClass())) {
			ProxyFactory proxyFactory = new ProxyFactory();

			TargetSource targetSource = new TargetSource(worldService);
			proxyFactory.setTargetSource(targetSource);
			proxyFactory.addAdvisor(advisor);
//			proxyFactory.setMethodMatcher(advisor.getPointcut().getMethodMatcher());
//			advisedSupport.setProxyTargetClass(true);   //JDK or CGLIB

			WorldService proxy = (WorldService) proxyFactory.getProxy();
			proxy.explode();
		}
	}
}