package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-10下午5:02:31
 */
public class ListBox extends Component{

	@Override
	public void updated() {
		// TODO Auto-generated method stub
		System.out.println("列表项更新");
	}
	
	public void select() {  
        System.out.println("列表框选中");  
    }

	@Override
	public void changed() {
		// TODO Auto-generated method stub
		select();
		mediator.componentChanged(this);
	}  
}
