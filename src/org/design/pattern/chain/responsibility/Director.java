package org.design.pattern.chain.responsibility;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-8下午2:26:39
 */
public class Director extends Approver{
	
	public Director(String name){
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if (request.getAmount() < 50000) {  
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求  
        }  
        else {  
            this.successor.processRequest(request);  //转发请求  
        }
	}
}
