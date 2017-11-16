package org.eureka.consumer.client.impl;

import org.eureka.consumer.client.ConsumerClient;
import org.springframework.stereotype.Component;

@Component
public class HystrixClient implements ConsumerClient {

	@Override
	public String hello(String v) {
		return "hi"+v+"访问hello方法出错";
	}

}
