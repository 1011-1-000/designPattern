package org.design.pattern.factory.method;

import org.design.pattern.XMLUtil2;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-3ÏÂÎç8:39:47
 */
public class FactoryMethodClientRemend {
	public static void main(String[] args){
		LoggerFactory factory = (LoggerFactory)XMLUtil2.getBean("/factory/method/config.xml","className");
		Logger logger = factory.createLogger();
		logger.writeLog();
	}
}
