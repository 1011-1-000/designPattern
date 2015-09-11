package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-10ÏÂÎç4:59:32
 */
public abstract class Component {
	protected Mediator mediator;
	
	public void setMediator(Mediator mediator){
		this.mediator = mediator;
	}
	
	public abstract void changed();
	
	public abstract void updated();
}
