package org.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 微服务配置中心
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
