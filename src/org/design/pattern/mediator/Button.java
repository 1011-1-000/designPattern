package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-10下午5:01:40
 */
public class Button extends Component{

	@Override
	public void updated() {
		// TODO Auto-generated method stub
		System.out.println("点击了按钮");
	}

	@Override
	public void changed() {
		// TODO Auto-generated method stub
		mediator.componentChanged(this);
	}
}
