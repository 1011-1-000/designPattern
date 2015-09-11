package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-10下午5:03:25
 */
public class ComboBox extends Component{

	@Override
	public void updated() {
		// TODO Auto-generated method stub
		System.out.println("组合框更新");
	}
	
	public void select() {  
        System.out.println("组合框选中");  
    }

	@Override
	public void changed() {
		// TODO Auto-generated method stub
		select();
		mediator.componentChanged(this);
	} 
}
