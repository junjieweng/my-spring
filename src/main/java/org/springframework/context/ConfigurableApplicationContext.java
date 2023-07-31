package org.springframework.context;

import org.springframework.beans.BeansException;
import org.springframework.core.metrics.ApplicationStartup;

import java.io.Closeable;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public interface ConfigurableApplicationContext extends ApplicationContext, Closeable {

	String SHUTDOWN_HOOK_THREAD_NAME = "SpringContextShutdownHook";

	void setApplicationStartup(ApplicationStartup applicationStartup);

	ApplicationStartup getApplicationStartup();
	/**
	 * 刷新容器
	 *
	 * @throws BeansException
	 */
	void refresh() throws BeansException;

	/**
	 * 关闭应用上下文
	 */
	@Override
	void close();

	/**
	 * 向虚拟机中注册一个钩子方法，在虚拟机关闭之前执行关闭容器等操作
	 */
	void registerShutdownHook();

}
