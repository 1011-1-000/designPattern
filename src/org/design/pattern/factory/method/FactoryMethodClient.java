package org.design.pattern.factory.method;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-3ÏÂÎç8:30:41
 */
public class FactoryMethodClient {
	public static void main(String[] args){
		LoggerFactory factory;
		Logger logger;
		factory = new FileLoggerFactory();
		logger = factory.createLogger();
		logger.writeLog();
	}
}
