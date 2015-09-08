package org.design.pattern.interpreter;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-8ÏÂÎç3:39:19
 */
public class InterpreterClient {
	public static void main(String args[]) {  
        String instruction = "up move 5 and down run 10 and left move 5";  
        InstructionHandler handler = new InstructionHandler();  
        handler.handle(instruction);  
        String outString;  
        outString = handler.output();  
        System.out.println(outString);  
    }
}
