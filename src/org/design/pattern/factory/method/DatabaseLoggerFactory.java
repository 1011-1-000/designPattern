package org.design.pattern.factory.method;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午7:57:37
 */
public class DatabaseLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		System.out.println("初始化各种数据库操作");
		Logger logger = new DatabaseLogger();
		System.out.println("初始化日志记录器");
		return logger;
	}

}
