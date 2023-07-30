package org.springframework.core.convert.converter;

/**
 * 类型转换器注册接口
 *
 * @author jjewng
 * @date 2023/05/28
 */
public interface ConverterRegistry {

	void addConverter(Converter<?, ?> converter);

	void addConverterFactory(ConverterFactory<?, ?> converterFactory);

	void addConverter(GenericConverter converter);
}
