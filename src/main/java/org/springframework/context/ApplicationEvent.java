package org.springframework.context;

import java.util.EventObject;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public abstract class ApplicationEvent extends EventObject {

	public ApplicationEvent(Object source) {
		super(source);
	}
}
