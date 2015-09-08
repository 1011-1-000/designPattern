package org.design.pattern.chain.responsibility;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����2:30:34
 */
public class ChainClient {
	 public static void main(String[] args) {  
	        Approver wjzhang,gyang,jguo,meeting;  
	        wjzhang = new Director("���޼�");  
	        gyang = new VicePresident("���");  
	        jguo = new President("����");  
	        meeting = new Congress("���»�");  
	      
	        //����ְ����  
	        wjzhang.setSuccessor(gyang);  
	        gyang.setSuccessor(jguo);  
	        jguo.setSuccessor(meeting);  
	          
	        //�����ɹ���  
	        PurchaseRequest pr1 = new PurchaseRequest(45000.0,10001,"�������콣");  
	        wjzhang.processRequest(pr1);  
	          
	        PurchaseRequest pr2 = new PurchaseRequest(60000.0,10002,"���򡶿������䡷");  
	        wjzhang.processRequest(pr2);  
	      
	        PurchaseRequest pr3 = new PurchaseRequest(160000.0,10003,"���򡶽�վ���");  
	        wjzhang.processRequest(pr3);  
	  
	        PurchaseRequest pr4 = new PurchaseRequest(800000.0,10004,"�����һ���");  
	        wjzhang.processRequest(pr4);  
	    }  
}
