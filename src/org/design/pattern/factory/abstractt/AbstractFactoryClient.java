package org.design.pattern.factory.abstractt;

import org.design.pattern.XMLUtil2;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-3ÏÂÎç10:17:41
 */
public class AbstractFactoryClient {
	public static void main(String[] args){
		SkinFactory skinFacktory = (SkinFactory)XMLUtil2.getBean("/factory/abstractt/config.xml", "className");
		Button b = skinFacktory.createButton();
		TextField t = skinFacktory.createTextField();
		ComboBox c = skinFacktory.createComboBox();
		b.display();
		t.display();
		c.display();
	}
}
