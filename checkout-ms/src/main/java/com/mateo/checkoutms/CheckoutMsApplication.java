package com.mateo.checkoutms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CheckoutMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckoutMsApplication.class, args);
	}

}
