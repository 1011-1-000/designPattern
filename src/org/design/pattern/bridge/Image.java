package org.design.pattern.bridge;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-5ÏÂÎç12:31:25
 */
public abstract class Image {
	protected ImageImpl imp;
	
	public void setImageImpl(ImageImpl imp){
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}
