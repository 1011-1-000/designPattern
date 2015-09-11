package org.design.pattern.observer;

import java.util.ArrayList;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-10下午11:59:22
 */
public abstract class AllyControlCenter {
	protected String allyName;
	protected ArrayList<Observer> players = new ArrayList<Observer>();
	
	public void setAllyName(String allyName){
		this.allyName = allyName;
	}
	
	public String getAllyName(){
		return allyName;
	}
	
	public void join(Observer o){
		System.out.println(o.getName()+"加入战队");
		players.add(o);
	}
	
	public void quit(Observer o){
		System.out.println(o.getName()+"退出战队");
	}
	
	public abstract void notifyObserver(String name);
}
