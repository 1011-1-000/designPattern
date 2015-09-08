package org.design.pattern.interpreter;

import java.util.Stack;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-8下午3:29:32
 */
public class InstructionHandler {
	private AbstractNode node;
	
	public void handle(String instruction){
		AbstractNode left = null,right = null;
		AbstractNode direction = null, action = null, distance = null;
		Stack stack = new Stack();
		String[] words = instruction.split(" ");
		for(int i = 0; i < words.length; i++){
			if (words[i].equalsIgnoreCase("and")) {  
                left = (AbstractNode)stack.pop(); //弹出栈顶表达式作为左表达式  
                String word1= words[++i];  
                direction = new DirectionNode(word1);  
                String word2 = words[++i];  
                action = new ActionNode(word2);  
                String word3 = words[++i];  
                distance = new DistanceNode(word3);  
                right = new SentenceNode(direction,action,distance); //右表达式  
                stack.push(new AndNode(left,right)); //将新表达式压入栈中  
            }  
            //如果是从头开始进行解释，则将前三个单词组成一个简单句子SentenceNode并将该句子压入栈中  
            else {  
                String word1 = words[i];  
                direction = new DirectionNode(word1);  
                String word2 = words[++i];  
                action = new ActionNode(word2);  
                String word3 = words[++i];  
                distance = new DistanceNode(word3);  
                left = new SentenceNode(direction,action,distance);  
                stack.push(left); //将新表达式压入栈中  
            }  
		}
		this.node = (AbstractNode)stack.pop();
	}
	
	public String output(){
		String result = node.interpret();
		return result;
	}
}
