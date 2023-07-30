package org.springframework.test.common.event;

import org.springframework.context.ApplicationListener;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(this.getClass().getName());
	}
}
