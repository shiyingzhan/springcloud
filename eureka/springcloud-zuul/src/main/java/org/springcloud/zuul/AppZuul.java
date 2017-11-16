package org.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 为服务负载均衡zuul
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class AppZuul 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(AppZuul.class, args);
    }
}
