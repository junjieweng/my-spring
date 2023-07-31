package org.springframework.core.metrics;

import java.util.function.Supplier;

/**
 * @author jjweng
 * @date: 2023/7/31
 */
public interface StartupStep {

    String getName();

    long getId();

    Long getParentId();

    StartupStep tag(String key, String value);

    StartupStep tag(String key, Supplier<String> value);

    Tags getTags();

    void end();


    interface Tags extends Iterable<Tag> {
    }


    interface Tag {

        String getKey();

        String getValue();
    }
}
