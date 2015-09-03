package org.design.pattern.factory.simple;

/**
 * @desciption: 产品抽象
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午4:39:40
 */
public abstract class Product {
	
	public void methodSame(){
		//公共方法的实现
		System.out.println("Product公共方法");
	}
	
	//抽象业务方法
	public abstract void methodDiff();
}
