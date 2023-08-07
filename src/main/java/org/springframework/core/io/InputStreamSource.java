package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author jjweng
 * @date 2023/8/7
 */
public interface InputStreamSource {
    InputStream getInputStream() throws IOException;
}
