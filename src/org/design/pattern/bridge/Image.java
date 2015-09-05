package org.design.pattern.bridge;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����12:31:25
 */
public abstract class Image {
	protected ImageImpl imp;
	
	public void setImageImpl(ImageImpl imp){
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}
