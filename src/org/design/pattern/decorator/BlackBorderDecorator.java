package org.design.pattern.decorator;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5下午4:25:01
 */
public class BlackBorderDecorator extends ComponentDecorator{
	
	public BlackBorderDecorator(Component component) {
		super(component);
	}

	public void display() {
		this.setBlackBorder();
		super.display();
	}

	public void setBlackBorder() {
		System.out.println("为构件增加黑色边框！");
	}
}
