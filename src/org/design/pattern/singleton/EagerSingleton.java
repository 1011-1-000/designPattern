package org.design.pattern.singleton;

/**
 * @desciption: ��������
 * ��̬��������EagerSingletonʵ����ʱ�ͻ����˽�еĹ��캯��
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-4����4:26:05
 */
public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
