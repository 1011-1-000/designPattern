package org.design.pattern.command;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-8下午2:41:25
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
		System.out.println("点击功能键："+name);
		command.execute();
	}
}
