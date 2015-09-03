package org.design.pattern.factory.simple;

import org.design.pattern.XMLUtil;

/**
 * @desciption: �ͻ���
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-3����4:48:10
 */
public class SimpleFactoryClient {
	public static void main(String[] args){
		String type = XMLUtil.getType("factory/simple/config.xml", "productType");
		Product p = SimpleFactory.getProduct(type);
		p.methodDiff();
	}
}
