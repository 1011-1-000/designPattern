package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-10����5:01:40
 */
public class Button extends Component{

	@Override
	public void updated() {
		// TODO Auto-generated method stub
		System.out.println("����˰�ť");
	}

	@Override
	public void changed() {
		// TODO Auto-generated method stub
		mediator.componentChanged(this);
	}
}
