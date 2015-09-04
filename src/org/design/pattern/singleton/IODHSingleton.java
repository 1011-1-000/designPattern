package org.design.pattern.singleton;

/**
 * @desciption: IODHָInitializati On Demand Holder
 * ���ֵ�������˶���������ģʽ���ŵ�
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-4����4:38:53
 */
public class IODHSingleton {
	private IODHSingleton(){}
	
	private static class HolderClass {
		private final static IODHSingleton instance = new IODHSingleton();
	}
	
	public static IODHSingleton getInstance(){
		return HolderClass.instance;
	}
	
	public static void main(String[] args){
		IODHSingleton s1,s2;
		s1 = IODHSingleton.getInstance();
		s2 = IODHSingleton.getInstance();
		System.out.println(s1 == s2);
	}
}
