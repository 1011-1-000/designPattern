package org.design.pattern.interpreter;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����3:28:27
 */
public class ActionNode extends AbstractNode{
	private String action;  
    
    public ActionNode(String action) {  
        this.action = action;  
    }  
      
    //�������ƶ���ʽ�����ʽ�Ľ��Ͳ���  
    public String interpret() {  
        if (action.equalsIgnoreCase("move")) {  
            return "�ƶ�";  
        }  
        else if (action.equalsIgnoreCase("run")) {  
            return "�����ƶ�";  
        }  
        else {  
            return "��Чָ��";  
        }  
    }  
}
