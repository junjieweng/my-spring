package org.springframework.aop;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface ClassFilter {

	boolean matches(Class<?> clazz);
}
