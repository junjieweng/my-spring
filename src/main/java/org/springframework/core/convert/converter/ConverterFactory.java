package org.springframework.core.convert.converter;

/**
 * 类型转换工厂
 *
 * @author jjewng
 * @date 2023/05/28
 */
public interface ConverterFactory<S, R> {

	<T extends R> Converter<S, T> getConverter(Class<T> targetType);
}