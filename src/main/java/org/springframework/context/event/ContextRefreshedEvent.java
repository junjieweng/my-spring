package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}
}
