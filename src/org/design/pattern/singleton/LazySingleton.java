package org.design.pattern.singleton;

/**
 * @desciption: 懒汉单例
 * 对整个getInstance方法加锁，但会对系统性能造成很大影响，尤其当初始化过程很长的时候
 * getInstance2采用双重检查锁定，需要注意的是，如果使用双重检查锁定来实现懒汉式单例类，
 * 需要在静态成员变量instance之前增加修饰符volatile，被volatile修饰的成员变量可以确保
 * 多个线程都能够正确处理，且该代码只能在JDK 1.5及以上版本中才能正确执行。由于volatile
 * 关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低，因此即使使用
 * 双重检查锁定来实现单例模式也不是一种完美的实现方式。 
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-4下午4:29:09
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
