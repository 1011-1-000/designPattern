package org.design.pattern.chain.responsibility;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����2:26:39
 */
public class Director extends Approver{
	
	public Director(String name){
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if (request.getAmount() < 50000) {  
            System.out.println("����" + this.name + "�����ɹ�����" + request.getNumber() + "����" + request.getAmount() + "Ԫ���ɹ�Ŀ�ģ�" + request.getPurpose() + "��");  //��������  
        }  
        else {  
            this.successor.processRequest(request);  //ת������  
        }
	}
}
