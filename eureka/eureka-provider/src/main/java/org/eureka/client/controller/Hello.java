package org.eureka.client.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping(value="/hello/{v}")
	public String hello(@PathVariable("v")String v){
		return "hello " + v;
	}
}
