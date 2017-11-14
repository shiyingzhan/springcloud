package org.eureka.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface EurekaApi {
	@RequestMapping(value="hello/{v}", method = RequestMethod.GET)
	String hello(@PathVariable("v")String v);
}
