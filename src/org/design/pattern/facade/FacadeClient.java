package org.design.pattern.facade;

import org.design.pattern.XMLUtil2;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-6����1:43:33
 */
public class FacadeClient {
	public static void main(String[] args){
		AbstractFacadeClass afc = (AbstractFacadeClass)XMLUtil2.getBean("facade/config.xml", "className");
		afc.fileEncrypt();
	}
}
