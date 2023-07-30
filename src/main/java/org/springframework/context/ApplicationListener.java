package org.springframework.context;

import java.util.EventListener;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

	void onApplicationEvent(E event);
}