package org.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 只需要一个注解@EnableEurekaServer，
 * 这个注解需要在springboot工程的启动application类上加
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication 
{
    public static void main( String[] args ){
    	try{
    		SpringApplication.run(EurekaserverApplication.class , args);
    	}catch(Exception e){
    	}
    }
}
