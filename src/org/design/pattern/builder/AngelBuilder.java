package org.design.pattern.builder;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����10:59:07
 */
public class AngelBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("��ʹ");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		 actor.setSex("Ů");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("Ư��");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("��ȹ");
	}

	@Override
	public void buildHairStyle() {
		// TODO Auto-generated method stub
		actor.setHairStyle("���糤��");
	}

}
