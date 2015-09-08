package org.design.pattern.interpreter;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-8下午3:27:33
 */
public class DirectionNode extends AbstractNode{
	
	private String direction;  
    
    public DirectionNode(String direction) {  
        this.direction = direction;  
    } 
	
	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		if (direction.equalsIgnoreCase("up")) {  
            return "向上";  
        }  
        else if (direction.equalsIgnoreCase("down")) {  
            return "向下";  
        }  
        else if (direction.equalsIgnoreCase("left")) {  
            return "向左";  
        }  
        else if (direction.equalsIgnoreCase("right")) {  
            return "向右";  
        }  
        else {  
            return "无效指令";  
        }  
	}

}
