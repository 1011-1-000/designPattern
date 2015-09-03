package org.design.pattern.factory.method;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午8:49:41
 */
public class CosoleLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		System.out.println("获取控制台的输入流");
		Logger logger = new CosoleLogger();
		return logger;
	}

}
