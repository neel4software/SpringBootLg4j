package com.tb.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(App.class, args);
		LOGGER.debug("A DEBUG Message");
		LOGGER.info("An INFO Message");
		LOGGER.warn("A WARN Message");
		LOGGER.error("An ERROR Message");
	}
}
