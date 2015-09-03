package org.design.pattern.factory.simple;

/**
 * @desciption: 简单工厂模式的核心是工厂类，在没有工厂类之前，
 * 客户端一般会使用new关键字来直接创建产品对象，而在引入工厂类之后，
 * 客户端可以通过工厂类来创建产品，在简单工厂模式中，工厂类提供了一个
 * 静态工厂方法供客户端使用，根据所传入的参数不同可以创建不同的产品对象，
 * 典型的工厂类代码如下所示：
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午4:43:11
 */
public class SimpleFactory {
	public static Product getProduct(String arg){
		Product product = null;
		if(arg.equalsIgnoreCase("A")){
			product = new ConcreteProductA();
			System.out.println("初始化A产品");
		}
		else if(arg.equalsIgnoreCase("B")){
			product = new ConcreteProductB();
			System.out.println("初始化B产品");
		}
		return product;
	}
}
