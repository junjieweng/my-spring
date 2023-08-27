package org.springframework.context.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

	private DefaultListableBeanFactory beanFactory;

	/**
	 * 创建 beanFactory 并加载 BeanDefinition
	 *
	 * @throws BeansException
	 */
	protected final void refreshBeanFactory() throws BeansException {
		DefaultListableBeanFactory beanFactory = createBeanFactory();
		loadBeanDefinitions(beanFactory);
		this.beanFactory = beanFactory;
	}

	/**
	 * 创建bean工厂
	 *
	 * @return
	 */
	protected DefaultListableBeanFactory createBeanFactory() {
		return new DefaultListableBeanFactory();
	}

	/**
	 * 加载BeanDefinition
	 *
	 * @param beanFactory
	 * @throws BeansException
	 */
	protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) throws BeansException;

	public DefaultListableBeanFactory getBeanFactory() {
		return beanFactory;
	}
}
