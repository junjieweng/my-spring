package org.springframework.core.convert;

/**
 * 类型转换抽象接口
 *
 * @author jjewng
 * @date 2023/05/28
 */
public interface ConversionService {

	boolean canConvert(Class<?> sourceType, Class<?> targetType);

	<T> T convert(Object source, Class<T> targetType);
}
