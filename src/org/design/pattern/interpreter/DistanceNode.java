package org.design.pattern.interpreter;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����3:28:57
 */
public class DistanceNode extends AbstractNode{
	private String distance;  
    
    public DistanceNode(String distance) {  
        this.distance = distance;  
    }  
      
//������ʽ�Ľ��Ͳ���  
    public String interpret() {  
        return this.distance;  
    }
}
