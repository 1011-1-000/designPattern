package org.design.pattern.observer;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-10����11:57:29
 */
public interface Observer {
	public String getName();
	public void setName(String name);
	public void help();
	public void beAttacked(AllyControlCenter acc);
}
