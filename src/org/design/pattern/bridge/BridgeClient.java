package org.design.pattern.bridge;

import org.design.pattern.XMLUtil2;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����1:33:34
 */
public class BridgeClient {
	public static void main(String[] args){
		Image image = (Image)XMLUtil2.getBean("bridge/config.xml", "img");
		ImageImpl imageImpl = (ImageImpl)XMLUtil2.getBean("bridge/config.xml", "system");
		
		image.setImageImpl(imageImpl);
		image.parseFile("��ͷ����Сͷ�ְ�");
	}
}
