package org.springframework.context;

/**
 * 事件发布者接口
 *
 * @author jjewng
 * @date 2023/05/28
 */
public interface ApplicationEventPublisher {

	/**
	 * 发布事件
	 *
	 * @param event
	 */
	void publishEvent(ApplicationEvent event);
}
