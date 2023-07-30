package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface ObjectFactory<T> {

	T getObject() throws BeansException;
}