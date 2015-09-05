package org.design.pattern.builder;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-5ÉÏÎç11:00:06
 */
public class DevilBuilder extends ActorBuilder{
	
	@Override
	public void buildType() {
		actor.setType("¶ñÄ§");
	}
	
	@Override
	public void buildSex() {
		actor.setSex("Ñı");
	}
	
	@Override
	public void buildFace() {
		actor.setFace("³óÂª");
	}
	
	@Override
	public void buildCostume() {
		actor.setCostume("ºÚÒÂ");
	}
	
	@Override
	public void buildHairStyle() {
		actor.setHairStyle("¹âÍ·");
	}
}
