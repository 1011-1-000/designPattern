package org.design.pattern.decorator;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����4:21:01
 */
public class ComponentDecorator extends Component{
	
	private Component component;
	
	public ComponentDecorator(Component component) {
		this.component = component;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		component.display();
	}

}
