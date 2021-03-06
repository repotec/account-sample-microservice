package com.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayApiZuulServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(GatewayApiZuulServerApplication.class, args);
	}

}
