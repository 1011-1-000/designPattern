package org.design.pattern.factory.method;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-3����8:49:41
 */
public class CosoleLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		System.out.println("��ȡ����̨��������");
		Logger logger = new CosoleLogger();
		return logger;
	}

}
