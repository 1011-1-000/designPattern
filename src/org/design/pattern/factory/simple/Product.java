package org.design.pattern.factory.simple;

/**
 * @desciption: ��Ʒ����
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-3����4:39:40
 */
public abstract class Product {
	
	public void methodSame(){
		//����������ʵ��
		System.out.println("Product��������");
	}
	
	//����ҵ�񷽷�
	public abstract void methodDiff();
}
