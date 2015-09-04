package org.design.pattern.prototype;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-4ÏÂÎç5:36:40
 */
public class PrototypeManagerClient {
	public static void main(String[] args){
		PrototypeManager pm = PrototypeManager.getPrototypeManager();
		
		OfficialDocument doc1,doc2,doc3,doc4;
		
		doc1 = pm.getOfficalDocument("far").clone();
		doc1.display();
		doc2 = pm.getOfficalDocument("far").clone();
		doc2.display();
		System.out.println(doc1 == doc2);
		
		doc3 = pm.getOfficalDocument("srs").clone();
		doc3.display();
		doc4 = pm.getOfficalDocument("srs").clone();
		doc4.display();
		System.out.println(doc3 == doc4);
	}
}
