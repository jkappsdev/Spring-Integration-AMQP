package com.comcast.commercial.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.comcast.commercial.common.message.MessageService;

public class MessageServiceUtil {
	
	private static final Log LOG = LogFactory.getLog(MessageServiceUtil.class);
	
	private MessageServiceUtil(){}

	private static MessageService messageService = null;
	
	public static void setMessageService(MessageService messageSvc) {
		messageService = messageSvc;
	}

	public static String getMessage(String key) {
		return messageService.getMessage(key);
	}

	public static String getMessage(String key, Object[] objArray) {
		LOG.debug("getMessage(String key, Object[] objArray): " + key + ", objArray: " + objArray);
		return messageService.getMessage(key, objArray);
	}
}
