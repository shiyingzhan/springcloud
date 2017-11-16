package org.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard //断路器仪表盘
@EnableCircuitBreaker   //一定不能少@EnableCircuitBreaker，刚开始就是少这个报的unable to connect错误
public class ApplicationConsumer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConsumer.class, args);
	}

}
