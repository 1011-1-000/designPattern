package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-10����5:03:25
 */
public class ComboBox extends Component{

	@Override
	public void updated() {
		// TODO Auto-generated method stub
		System.out.println("��Ͽ����");
	}
	
	public void select() {  
        System.out.println("��Ͽ�ѡ��");  
    }

	@Override
	public void changed() {
		// TODO Auto-generated method stub
		select();
		mediator.componentChanged(this);
	} 
}
