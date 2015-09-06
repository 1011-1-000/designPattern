package org.design.pattern.flyweight;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-6����2:58:38
 */
public abstract class IgoChessman {
	public abstract String getColor();
	
	public void display(Coordinates c){
		System.out.println("������ɫ��"+this.getColor()+"|���꣺("+c.getX()+","+c.getY()+")");
	}
}
