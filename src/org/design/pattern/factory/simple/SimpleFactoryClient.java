package org.design.pattern.factory.simple;

import org.design.pattern.XMLUtil;

/**
 * @desciption: 客户端
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午4:48:10
 */
public class SimpleFactoryClient {
	public static void main(String[] args){
		String type = XMLUtil.getType("factory/simple/config.xml", "productType");
		Product p = SimpleFactory.getProduct(type);
		p.methodDiff();
	}
}
