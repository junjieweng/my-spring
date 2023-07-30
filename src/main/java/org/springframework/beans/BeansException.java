package org.springframework.beans;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public class BeansException extends RuntimeException {

	public BeansException(String msg) {
		super(msg);
	}

	public BeansException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
