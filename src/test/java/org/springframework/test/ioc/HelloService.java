package org.springframework.test.ioc;

/**
 * @author jjewng
 * @date 2023/05/28
 */
public class HelloService {

	public String sayHello() {
		System.out.println("hello");
		return "hello";
	}
}
