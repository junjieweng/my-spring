package org.springframework.test.common;

import org.springframework.core.convert.converter.Converter;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public class StringToIntegerConverter implements Converter<String, Integer> {
	@Override
	public Integer convert(String source) {
		return Integer.valueOf(source);
	}
}
