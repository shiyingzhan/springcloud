package org.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SpringCloudConfigClientTest {	
	@Value("${profile}")
	String profile;
	
	@RequestMapping(value = "/hi")
	public String hi() {
		return "profile:"+profile;
	}
	
//	@Value("${db.user}")
//	String dbUser;
//	
//	@RequestMapping(value = "/hidb")
//	public String hiDB() {
//		return "dbUser:"+dbUser;
//	}
}
