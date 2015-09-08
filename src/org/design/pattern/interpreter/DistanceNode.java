package org.design.pattern.interpreter;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-8下午3:28:57
 */
public class DistanceNode extends AbstractNode{
	private String distance;  
    
    public DistanceNode(String distance) {  
        this.distance = distance;  
    }  
      
//距离表达式的解释操作  
    public String interpret() {  
        return this.distance;  
    }
}
