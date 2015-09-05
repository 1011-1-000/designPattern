package org.design.pattern.composite;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5下午2:41:18
 */
public abstract class AbstractFile {
	public void add(AbstractFile file){
		System.out.println("不支持该方法");
	}
	public void remove(AbstractFile file){
		System.out.println("不支持该方法");
	}
	public AbstractFile getChild(int i){
		System.out.println("不支持该方法");
		return null;
	}
	public abstract void killVirus();
}
