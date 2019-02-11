package org.karthik.amqp.Demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan("org.springframework.integration.samples.rest.controller")
@ImportResource("classpath:cmps-application-context.xml")
@SpringBootApplication
public class DemoApplication {

	private static final Log LOGGER = LogFactory.getLog(DemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		LOGGER.info("\n========================================================="
				  + "\n                                                         "
				  + "\n          Welcome to Spring Integration!                 "
				  + "\n                                                         "
				  + "\n    For more information please visit:                   "
				  + "\n    http://www.springsource.org/spring-integration       "
				  + "\n                                                         "
				  + "\n=========================================================" );

		LOGGER.info("\n========================================================="
				  + "\n                                                          "
				  + "\n    This is the AMQP Sample -                             "
				  + "\n                                                          "
				  + "\n    Please enter some text and press return. The entered  "
				  + "\n    Message will be sent to the configured RabbitMQ Queue,"
				  + "\n    then again immediately retrieved from the Message     "
				  + "\n    Broker and ultimately printed to the command line.    "
				  + "\n                                                          "
				  + "\n=========================================================" );

	
	}

}

