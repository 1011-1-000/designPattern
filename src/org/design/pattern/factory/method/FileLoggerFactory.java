package org.design.pattern.factory.method;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-3����8:00:09
 */
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		System.out.println("�����ļ���־��¼������");
		Logger logger = new FileLogger();
		System.out.println("�����ļ��Ȳ���");
		return logger;
	}

}
