package com.comcast.commercial.messagepublication.integration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.messaging.Message;

public class IntegrationRouter {
	
	public List<String> vaidator(@SuppressWarnings("rawtypes") Message message){
		
		System.out.println("Hello this is from Router");
		List<String> results = new ArrayList<String>();
		CMPSMessageWrapper wrapper = (CMPSMessageWrapper) message.getPayload();
		if(wrapper.getProcessorMap().get("isValidationSuccess").equals("true"))
		{
			results.add("dataPersistAndPostChannel");
			results.add("publishRestResponseChannel");
		}
		return results;
	}
	
	public void vaidateRequestType(@SuppressWarnings("rawtypes") Message message) {
		List<String> results = new ArrayList<String>();
		CMPSMessageWrapper wrapper = (CMPSMessageWrapper) message.getPayload();
		if("PERSIST".equals(wrapper.getProcessorMap().get("requestType"))) {
			results.add("cisAuditDBInsertionChannel");
		}
	}

}
