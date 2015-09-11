package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-10下午5:04:07
 */
public class TextBox extends Component{

	@Override
	public void updated() {
		// TODO Auto-generated method stub
		System.out.println("文本框更新");
	}
	
	public void setText() {  
        System.out.println("文本框显示");  
    }

	@Override
	public void changed() {
		// TODO Auto-generated method stub
		setText();
		mediator.componentChanged(this);
	} 
}
