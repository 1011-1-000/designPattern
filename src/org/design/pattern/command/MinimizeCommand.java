package org.design.pattern.command;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-8ÏÂÎç2:51:11
 */
public class MinimizeCommand extends Command{
	
	private WindowHanlder whobj;
	
	public MinimizeCommand(){
		whobj = new WindowHanlder();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		whobj.minimize();
	}

}
