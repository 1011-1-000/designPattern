package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-10����5:02:31
 */
public class ListBox extends Component{

	@Override
	public void updated() {
		// TODO Auto-generated method stub
		System.out.println("�б������");
	}
	
	public void select() {  
        System.out.println("�б��ѡ��");  
    }

	@Override
	public void changed() {
		// TODO Auto-generated method stub
		select();
		mediator.componentChanged(this);
	}  
}
