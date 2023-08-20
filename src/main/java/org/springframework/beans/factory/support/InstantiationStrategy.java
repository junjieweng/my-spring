package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * Bean 的实例化策略
 *
 * @author jjewng
 * @date 2023/05/28
 */
public interface InstantiationStrategy {

	Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
