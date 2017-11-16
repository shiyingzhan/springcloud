package org.eureka.consumer.client;

import org.eureka.api.EurekaApi;
import org.eureka.consumer.client.impl.HystrixClient;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "sp",fallback = HystrixClient.class)
public interface ConsumerClient extends EurekaApi{}
