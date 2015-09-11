package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-10����4:59:32
 */
public abstract class Component {
	protected Mediator mediator;
	
	public void setMediator(Mediator mediator){
		this.mediator = mediator;
	}
	
	public abstract void changed();
	
	public abstract void updated();
}
