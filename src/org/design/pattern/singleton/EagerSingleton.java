package org.design.pattern.singleton;

/**
 * @desciption: 饿汉单例
 * 静态变量会在EagerSingleton实例化时就会调用私有的构造函数
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-4下午4:26:05
 */
public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
