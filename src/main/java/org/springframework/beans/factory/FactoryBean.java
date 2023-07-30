package org.springframework.beans.factory;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface FactoryBean<T> {

	T getObject() throws Exception;

	boolean isSingleton();
}
