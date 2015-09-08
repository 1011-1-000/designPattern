package org.design.pattern.interpreter;

import java.util.Stack;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����3:29:32
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
                left = (AbstractNode)stack.pop(); //����ջ�����ʽ��Ϊ����ʽ  
                String word1= words[++i];  
                direction = new DirectionNode(word1);  
                String word2 = words[++i];  
                action = new ActionNode(word2);  
                String word3 = words[++i];  
                distance = new DistanceNode(word3);  
                right = new SentenceNode(direction,action,distance); //�ұ��ʽ  
                stack.push(new AndNode(left,right)); //���±��ʽѹ��ջ��  
            }  
            //����Ǵ�ͷ��ʼ���н��ͣ���ǰ�����������һ���򵥾���SentenceNode�����þ���ѹ��ջ��  
            else {  
                String word1 = words[i];  
                direction = new DirectionNode(word1);  
                String word2 = words[++i];  
                action = new ActionNode(word2);  
                String word3 = words[++i];  
                distance = new DistanceNode(word3);  
                left = new SentenceNode(direction,action,distance);  
                stack.push(left); //���±��ʽѹ��ջ��  
            }  
		}
		this.node = (AbstractNode)stack.pop();
	}
	
	public String output(){
		String result = node.interpret();
		return result;
	}
}
