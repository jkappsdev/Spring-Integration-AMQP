package com.comcast.commercial.messagepublication.rest.processor;


import org.springframework.integration.handler.MessageProcessor;
import org.springframework.messaging.Message;

import com.comcast.commercial.messagepublication.integration.CMPSMessageWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


@SuppressWarnings("rawtypes")
public class PublishRestRequestProcessor implements MessageProcessor {
	
	public Object processMessage(Message message){
		
		System.out.println("Message's Instance in processor :: " + message.getPayload().getClass());
		System.out.println("Message from processor :: " + message.getPayload());
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			CMPSMessageWrapper wrapper = objectMapper.convertValue(message.getPayload()  , CMPSMessageWrapper.class);
			
			System.out.println("Request Type messageNotification:: " + wrapper.getProcessorMap().get("requestType"));
			
			convertMessageToJson( message);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		return message;
	}
	
	private String convertMessageToJson(Message message) throws JsonProcessingException {
		System.out.println("Inside convertMessageToJson");
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(message.getPayload());
		System.out.println("JSON :: " + json);
		return json;
	}

	
}
