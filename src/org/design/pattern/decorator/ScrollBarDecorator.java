package org.design.pattern.decorator;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5下午4:22:24
 */
public class ScrollBarDecorator extends ComponentDecorator{

	public ScrollBarDecorator(Component component) {
		super(component);
	}
	
	public void display(){
		this.setScrollBar();
		super.display();
	}
	
	public void setScrollBar(){
		System.out.println("加载滚动条");
	}
}
