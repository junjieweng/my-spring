package org.springframework.core.metrics;

/**
 * Spring 5.3 引入，用于在启动期间记录应用程序的各个步骤，以帮助开发者了解应用程序的启动过程和性能
 * @author jjweng
 * @date: 2023/7/31
 */
public interface ApplicationStartup {
    ApplicationStartup DEFAULT = new DefaultApplicationStartup();

    StartupStep start(String name);
}
