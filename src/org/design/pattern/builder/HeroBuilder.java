package org.design.pattern.builder;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-5ÉÏÎç10:56:13
 */
public class HeroBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("Ó¢ÐÛ");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("ÄÐ");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("Ó¢¿¡");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("¿ø¼×");
	}

	@Override
	public void buildHairStyle() {
		// TODO Auto-generated method stub
		actor.setHairStyle("Æ®ÒÝ");
	}
}
