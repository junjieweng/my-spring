package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

	/**
	 * 简单的 bean 实例化策略，根据 bean 的无参构造函数实例化对象
	 *
	 * @param beanDefinition
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
		Class<?> beanClass = beanDefinition.getBeanClass();
		try {
			Constructor<?> constructor = beanClass.getDeclaredConstructor();
			return constructor.newInstance();
		} catch (Exception e) {
			throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
		}
	}
}
