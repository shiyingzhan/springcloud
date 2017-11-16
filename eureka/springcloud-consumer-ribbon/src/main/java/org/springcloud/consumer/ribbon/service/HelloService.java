package org.springcloud.consumer.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service("helloService")
public class HelloService {
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod ="hiError")
	public String hello(String v){
		return restTemplate.getForObject("http://sp/hello/"+v, String.class);
	}
	
	public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
