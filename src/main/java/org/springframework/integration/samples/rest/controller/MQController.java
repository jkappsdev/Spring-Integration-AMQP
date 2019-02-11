package org.springframework.integration.samples.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comcast.commercial.messagepublication.integration.CMPSMessageWrapper;

@RestController
@EnableIntegration
public class MQController {
	
	@Autowired
	DirectChannel channel;
	
	@RequestMapping("/welcome")
	String basicURL() {
		return "Welcome to Spring Boot Hello World Tutorial";
	}
	
	@GetMapping
	@RequestMapping("/publish")
	public String publish() {
		System.out.println("With in publish method");
		CMPSMessageWrapper cmpsMessageWrapper = new CMPSMessageWrapper();
		@SuppressWarnings("rawtypes")
		Message message = MessageBuilder.withPayload(cmpsMessageWrapper).build();
		System.out.println(message.getPayload().toString());
		channel.send(message);
		return "Hello";
	
	}

}
