package org.design.pattern.chain.responsibility;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����2:26:39
 */
public class President extends Approver{
	
	public President(String name){
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if (request.getAmount() < 500000) {  
            System.out.println("���³�" + this.name + "�����ɹ�����" + request.getNumber() + "����" + request.getAmount() + "Ԫ���ɹ�Ŀ�ģ�" + request.getPurpose() + "��");  //��������  
        }  
        else {  
            this.successor.processRequest(request);  //ת������  
        }
	}
}
