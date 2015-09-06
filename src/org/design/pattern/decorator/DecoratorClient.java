package org.design.pattern.decorator;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-5ÏÂÎç4:25:50
 */
public class DecoratorClient {
	public static void main(String[] args){
		Component component = new Window();
		Component cd = new ScrollBarDecorator(component);
		cd.display();
		Component cd1 = new BlackBorderDecorator(cd);
		cd1.display();
	}
}
