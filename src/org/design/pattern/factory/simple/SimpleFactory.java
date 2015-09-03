package org.design.pattern.factory.simple;

/**
 * @desciption: �򵥹���ģʽ�ĺ����ǹ����࣬��û�й�����֮ǰ��
 * �ͻ���һ���ʹ��new�ؼ�����ֱ�Ӵ�����Ʒ���󣬶������빤����֮��
 * �ͻ��˿���ͨ����������������Ʒ���ڼ򵥹���ģʽ�У��������ṩ��һ��
 * ��̬�����������ͻ���ʹ�ã�����������Ĳ�����ͬ���Դ�����ͬ�Ĳ�Ʒ����
 * ���͵Ĺ��������������ʾ��
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-3����4:43:11
 */
public class SimpleFactory {
	public static Product getProduct(String arg){
		Product product = null;
		if(arg.equalsIgnoreCase("A")){
			product = new ConcreteProductA();
			System.out.println("��ʼ��A��Ʒ");
		}
		else if(arg.equalsIgnoreCase("B")){
			product = new ConcreteProductB();
			System.out.println("��ʼ��B��Ʒ");
		}
		return product;
	}
}
