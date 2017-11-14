package org.eureka.consumer.controller;

import org.eureka.consumer.client.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaConsumer {
	@Autowired
	private ConsumerClient consumerClient;
	@RequestMapping("/hello/{v}")
	public String hello(@PathVariable("v")String v){
		String a =  consumerClient.hello(v);
		return a;
	}
	
}
