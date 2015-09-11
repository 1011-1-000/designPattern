package org.design.pattern.observer;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-10ÏÂÎç11:57:29
 */
public interface Observer {
	public String getName();
	public void setName(String name);
	public void help();
	public void beAttacked(AllyControlCenter acc);
}
