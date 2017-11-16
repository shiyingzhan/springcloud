package org.springcloud.consumer.ribbon.controller;

import org.springcloud.consumer.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hello/{v}")
	public String hello(@PathVariable("v")String v){
		return helloService.hello(v);
	}
}
