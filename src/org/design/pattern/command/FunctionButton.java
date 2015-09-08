package org.design.pattern.command;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����2:41:25
 */
public class FunctionButton {
	private String name;
	private Command command;
	public FunctionButton(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void onClick(){
		System.out.println("������ܼ���"+name);
		command.execute();
	}
}
