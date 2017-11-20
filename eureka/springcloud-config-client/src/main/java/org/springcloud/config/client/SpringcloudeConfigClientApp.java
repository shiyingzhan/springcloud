package org.springcloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 微服务配置客户端
 */
@SpringBootApplication
public class SpringcloudeConfigClientApp 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(SpringcloudeConfigClientApp.class, args);
    }
}
