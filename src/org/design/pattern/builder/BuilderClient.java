package org.design.pattern.builder;

import org.design.pattern.XMLUtil2;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-5ÉÏÎç11:04:41
 */
public class BuilderClient {
	public static void main(String[] args){
		ActorBuilder ab = (ActorBuilder)XMLUtil2.getBean("builder/config.xml", "className");
		
		ActorController ac = new ActorController();
		Actor actor = ac.construct(ab);
		System.out.println(actor);
	}
}
