package com.mylove.java.configuration;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



/**
 * @author Neeraj
 * TO generate the log in red color in spring 5.1 add the below entry
 */
@Configuration
@PropertySource("classpath:logging.properties")
public class Spring5_1LoggingConfiguration {

	// when user will retrive the bean, replace the code with below code
	
//	AnnotationConfigApplicationContext context = 
//			new AnnotationConfigApplicationContext(Spring5_1LoggingConfiguration.class, SpringConfiguationClassWithAnnotation.class);
//	
	@Value("root.logger.level")
	private String rootLoggerLevel;
	
	@Value("printed.logger.level")
	private String printedLoggerLevel;
	
	@PostConstruct
	public void initLogger() {

		// parse levels
		Level rootLevel = Level.parse(rootLoggerLevel);
		Level printedLevel = Level.parse(printedLoggerLevel);
		
		// get logger for app context
		Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

		// get parent logger
		Logger loggerParent = applicationContextLogger.getParent();

		// set root logging level
		loggerParent.setLevel(rootLevel);
		
		// set up console handler
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(printedLevel);
		consoleHandler.setFormatter(new SimpleFormatter());
		
		// add handler to the logger
		loggerParent.addHandler(consoleHandler);
	}
}
