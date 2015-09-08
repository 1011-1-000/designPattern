package org.design.pattern.interpreter;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����3:27:33
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
            return "����";  
        }  
        else if (direction.equalsIgnoreCase("down")) {  
            return "����";  
        }  
        else if (direction.equalsIgnoreCase("left")) {  
            return "����";  
        }  
        else if (direction.equalsIgnoreCase("right")) {  
            return "����";  
        }  
        else {  
            return "��Чָ��";  
        }  
	}

}
