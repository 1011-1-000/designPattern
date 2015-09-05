package org.design.pattern.builder;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-5ÉÏÎç10:50:05
 */
public abstract class ActorBuilder {
	protected Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairStyle();
	
	public Actor createActor(){
		return actor;
	}
}
