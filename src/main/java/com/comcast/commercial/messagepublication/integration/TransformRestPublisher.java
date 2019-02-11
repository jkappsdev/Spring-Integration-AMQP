package com.comcast.commercial.messagepublication.integration;

import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.transformer.AbstractTransformer;
import org.springframework.messaging.Message;

import com.comcast.commercial.schemafiles.rest.publishservice.MessagePublicationServiceRequest;

public class TransformRestPublisher extends AbstractTransformer  {
	
	private String isRestPublishService;

	public String getIsRestPublishService() {
		return isRestPublishService;
	}

	public void setIsRestPublishService(String isRestPublishService) {
		this.isRestPublishService = isRestPublishService;
	}
	
	
	@Override
	@Transformer(outputChannel = "fromRabbit")
	protected Object doTransform(Message<?> message) throws Exception {
		System.out.println("Message is of type:: " + message.getClass().getSimpleName());
		//Assert.isTrue(message.getPayload() instanceof String, "payload must be an GenericMessage");
		String s =  (String) message.getPayload().toString();
		System.out.println("Generic Message has been converted to String:: " + s);
		
		CMPSMessageWrapper wrapper = new CMPSMessageWrapper();
		wrapper.setMessagePublicationServiceRequest(new MessagePublicationServiceRequest());
		wrapper.getProcessorMap().put("isValidationSuccess", "true");
		wrapper.getProcessorMap().put("requestType", "PERSIST");
		
		return wrapper;
	}

}
