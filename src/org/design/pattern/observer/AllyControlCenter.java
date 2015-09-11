package org.design.pattern.observer;

import java.util.ArrayList;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-10����11:59:22
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
		System.out.println(o.getName()+"����ս��");
		players.add(o);
	}
	
	public void quit(Observer o){
		System.out.println(o.getName()+"�˳�ս��");
	}
	
	public abstract void notifyObserver(String name);
}
