package org.springcloud.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 * 使用ribbon实现负载均衡
 * 使用hystrix实现断路器的功能：某个接口挂了，就返回某种固定值
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class App 
{
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
    
    @Bean
    @LoadBalanced //实现负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    } 
}
