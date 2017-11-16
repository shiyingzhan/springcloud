package org.springcloud.service.provider_2.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@Value("${server.port}")
	String port;
	
	@RequestMapping(value="/hello/{v}")
	public String hello(@PathVariable("v")String v){
		return "hello " + v+"端口号："+ port;
	}

}
