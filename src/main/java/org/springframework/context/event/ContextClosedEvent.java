package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public class ContextClosedEvent extends ApplicationContextEvent {

	public ContextClosedEvent(ApplicationContext source) {
		super(source);
	}
}
