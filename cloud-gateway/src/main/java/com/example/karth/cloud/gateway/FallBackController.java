package com.example.karth.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

	@HystrixCommand(fallbackMethod = "userServiceFallBackMethod", commandProperties= { 
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "0")})
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User Service is taking longer than expected." +
				"Please try again later";
	}
	
	@HystrixCommand(fallbackMethod = "movieServiceFallBackMethod", commandProperties= { 
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "4000")})
	@GetMapping("/movieServiceFallBack")
	public String movieServiceFallBackMethod() {
		return "Movie Service is taking longer than expected." +
				"Please try again later";
	}
}
