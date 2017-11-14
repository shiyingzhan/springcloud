package org.eureka.consumer.client;

import org.eureka.api.EurekaApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value="sp")
public interface ConsumerClient extends EurekaApi{}
