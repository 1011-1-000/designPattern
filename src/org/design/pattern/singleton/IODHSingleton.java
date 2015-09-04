package org.design.pattern.singleton;

/**
 * @desciption: IODH指Initializati On Demand Holder
 * 这种单例结合了饿汉及懒汉模式的优点
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-4下午4:38:53
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
