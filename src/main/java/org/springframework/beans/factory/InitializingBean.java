package org.springframework.beans.factory;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface InitializingBean {

	void afterPropertiesSet() throws Exception;
}
