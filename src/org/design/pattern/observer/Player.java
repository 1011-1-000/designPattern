package org.design.pattern.observer;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-11����12:09:18
 */
public class Player implements Observer{
	private String name;
	
	public Player(String name){
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("���ס��" + this.name + "�����㣡"); 
	}

	@Override
	public void beAttacked(AllyControlCenter acc) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "��������");  
        acc.notifyObserver(name);
	}

}
