package org.design.pattern.factory.method;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-3����7:57:37
 */
public class DatabaseLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ���������ݿ����");
		Logger logger = new DatabaseLogger();
		System.out.println("��ʼ����־��¼��");
		return logger;
	}

}
