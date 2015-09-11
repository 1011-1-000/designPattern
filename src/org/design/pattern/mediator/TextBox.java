package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-10����5:04:07
 */
public class TextBox extends Component{

	@Override
	public void updated() {
		// TODO Auto-generated method stub
		System.out.println("�ı������");
	}
	
	public void setText() {  
        System.out.println("�ı�����ʾ");  
    }

	@Override
	public void changed() {
		// TODO Auto-generated method stub
		setText();
		mediator.componentChanged(this);
	} 
}
