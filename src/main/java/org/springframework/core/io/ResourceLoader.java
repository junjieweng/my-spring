package org.springframework.core.io;

/**
 * 资源加载器接口
 *
 * @author jjewng
 * @date 2023/05/28
 */
public interface ResourceLoader {

	Resource getResource(String location);
}
