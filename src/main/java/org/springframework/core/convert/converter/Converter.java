package org.springframework.core.convert.converter;

/**
 * 类型转换抽象接口
 *
 * @author jjewng
 * @date 2023/05/28
 */
public interface Converter<S, T> {

	/**
	 * 类型转换
	 */
	T convert(S source);
}
