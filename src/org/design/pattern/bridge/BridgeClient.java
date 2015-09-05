package org.design.pattern.bridge;

import org.design.pattern.XMLUtil2;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5下午1:33:34
 */
public class BridgeClient {
	public static void main(String[] args){
		Image image = (Image)XMLUtil2.getBean("bridge/config.xml", "img");
		ImageImpl imageImpl = (ImageImpl)XMLUtil2.getBean("bridge/config.xml", "system");
		
		image.setImageImpl(imageImpl);
		image.parseFile("大头儿子小头爸爸");
	}
}
