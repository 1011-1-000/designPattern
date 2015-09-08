package org.design.pattern.command;

import org.design.pattern.XMLUtil2;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-8下午2:52:24
 */
public class CommandClient {
	public static void main(String[] args){
		Command helpCommand = (Command) XMLUtil2.getBean("command/config.xml", "helpCommand");
		Command minimizeCommand = (Command) XMLUtil2.getBean("command/config.xml", "minimizeCommand");
		
		FBSettingWindow fbsw = new FBSettingWindow("功能键设置");
		FunctionButton fb1 = new FunctionButton("F1");
		FunctionButton fb2 = new FunctionButton("F2");
		
		fb1.setCommand(minimizeCommand);
		fb2.setCommand(helpCommand);
		
		fbsw.addFunctionButton(fb1);
		fbsw.addFunctionButton(fb2);
		
		fbsw.display();
		
		fb1.onClick();
		fb2.onClick();
	}
}
