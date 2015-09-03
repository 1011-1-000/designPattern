package org.design.pattern.factory.method;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午8:00:09
 */
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		System.out.println("创建文件日志记录器对象");
		Logger logger = new FileLogger();
		System.out.println("创建文件等操作");
		return logger;
	}

}
