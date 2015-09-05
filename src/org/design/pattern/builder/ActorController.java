package org.design.pattern.builder;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����11:01:43
 */
public class ActorController {
	public Actor construct(ActorBuilder ab){
		Actor actor;
		ab.buildCostume();
		ab.buildFace();
		ab.buildHairStyle();
		ab.buildSex();
		ab.buildType();
		
		actor = ab.createActor();
		return actor;
	}
}
