package org.design.pattern.builder;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����10:56:13
 */
public class HeroBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("Ӣ��");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("��");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("Ӣ��");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("����");
	}

	@Override
	public void buildHairStyle() {
		// TODO Auto-generated method stub
		actor.setHairStyle("Ʈ��");
	}
}
