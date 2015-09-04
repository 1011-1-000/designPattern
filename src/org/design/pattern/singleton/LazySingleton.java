package org.design.pattern.singleton;

/**
 * @desciption: ��������
 * ������getInstance���������������ϵͳ������ɺܴ�Ӱ�죬���䵱��ʼ�����̺ܳ���ʱ��
 * getInstance2����˫�ؼ����������Ҫע����ǣ����ʹ��˫�ؼ��������ʵ������ʽ�����࣬
 * ��Ҫ�ھ�̬��Ա����instance֮ǰ�������η�volatile����volatile���εĳ�Ա��������ȷ��
 * ����̶߳��ܹ���ȷ�����Ҹô���ֻ����JDK 1.5�����ϰ汾�в�����ȷִ�С�����volatile
 * �ؼ��ֻ�����Java�����������һЩ�����Ż������ܻᵼ��ϵͳ����Ч�ʽ��ͣ���˼�ʹʹ��
 * ˫�ؼ��������ʵ�ֵ���ģʽҲ����һ��������ʵ�ַ�ʽ�� 
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-4����4:29:09
 */
public class LazySingleton {
	public static LazySingleton instance = null;
	private LazySingleton(){}
	
	synchronized public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
	
	public static LazySingleton getInstance2(){
		if(instance == null){
			synchronized (LazySingleton.class) {
				if(instance == null){
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
}
