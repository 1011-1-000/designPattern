package org.design.pattern.composite;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����2:41:18
 */
public abstract class AbstractFile {
	public void add(AbstractFile file){
		System.out.println("��֧�ָ÷���");
	}
	public void remove(AbstractFile file){
		System.out.println("��֧�ָ÷���");
	}
	public AbstractFile getChild(int i){
		System.out.println("��֧�ָ÷���");
		return null;
	}
	public abstract void killVirus();
}
