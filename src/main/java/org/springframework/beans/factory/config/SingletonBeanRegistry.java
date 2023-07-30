package org.springframework.beans.factory.config;

/**
 * 单例注册表
 *
 * @author jjewng
 * @date 2023/05/28
 */
public interface SingletonBeanRegistry {

	Object getSingleton(String beanName);

	void addSingleton(String beanName, Object singletonObject);
}
