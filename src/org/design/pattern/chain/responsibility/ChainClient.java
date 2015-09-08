package org.design.pattern.chain.responsibility;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-8下午2:30:34
 */
public class ChainClient {
	 public static void main(String[] args) {  
	        Approver wjzhang,gyang,jguo,meeting;  
	        wjzhang = new Director("张无忌");  
	        gyang = new VicePresident("杨过");  
	        jguo = new President("郭靖");  
	        meeting = new Congress("董事会");  
	      
	        //创建职责链  
	        wjzhang.setSuccessor(gyang);  
	        gyang.setSuccessor(jguo);  
	        jguo.setSuccessor(meeting);  
	          
	        //创建采购单  
	        PurchaseRequest pr1 = new PurchaseRequest(45000.0,10001,"购买倚天剑");  
	        wjzhang.processRequest(pr1);  
	          
	        PurchaseRequest pr2 = new PurchaseRequest(60000.0,10002,"购买《葵花宝典》");  
	        wjzhang.processRequest(pr2);  
	      
	        PurchaseRequest pr3 = new PurchaseRequest(160000.0,10003,"购买《金刚经》");  
	        wjzhang.processRequest(pr3);  
	  
	        PurchaseRequest pr4 = new PurchaseRequest(800000.0,10004,"购买桃花岛");  
	        wjzhang.processRequest(pr4);  
	    }  
}
