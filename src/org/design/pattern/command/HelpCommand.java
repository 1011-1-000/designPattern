package org.design.pattern.command;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����2:49:17
 */
public class HelpCommand extends Command{
	
	private HelpHandler hhobj;
	
	public HelpCommand(){
		hhobj = new HelpHandler();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		hhobj.display();
	}
	
}
