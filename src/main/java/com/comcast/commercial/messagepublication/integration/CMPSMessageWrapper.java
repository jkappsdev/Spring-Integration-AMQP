package com.comcast.commercial.messagepublication.integration;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.comcast.commercial.schemafiles.rest.publishservice.MessagePublicationServiceRequest;

public class CMPSMessageWrapper implements Serializable {

	private static final long serialVersionUID = 1L;

	private MessagePublicationServiceRequest messagePublicationServiceRequest;
	
	private Map<Object, Object> processorMap = new HashMap<Object, Object>();
	
	public MessagePublicationServiceRequest getMessagePublicationServiceRequest() {
		return messagePublicationServiceRequest;
	}

	public void setMessagePublicationServiceRequest(MessagePublicationServiceRequest messagePublicationServiceRequest) {
		this.messagePublicationServiceRequest = messagePublicationServiceRequest;
	}

	public Map<Object, Object> getProcessorMap() {
		return processorMap;
	}

	public void setProcessorMap(Map<Object, Object> processorMap) {
		this.processorMap = processorMap;
	}

}
