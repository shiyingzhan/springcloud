package org.springcloud.config.client.controllet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudConfigClientTest {
	@Value("${username}")
	String username;
	
	@Value("${myname}")
	String myname;
	
//	@Value("${foo}")
//	String foo;

	@RequestMapping(value = "/hi")
	public String hi() {
		return username +  "  " + myname;
	}
}
