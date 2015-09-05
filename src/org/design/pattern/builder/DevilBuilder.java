package org.design.pattern.builder;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����11:00:06
 */
public class DevilBuilder extends ActorBuilder{
	
	@Override
	public void buildType() {
		actor.setType("��ħ");
	}
	
	@Override
	public void buildSex() {
		actor.setSex("��");
	}
	
	@Override
	public void buildFace() {
		actor.setFace("��ª");
	}
	
	@Override
	public void buildCostume() {
		actor.setCostume("����");
	}
	
	@Override
	public void buildHairStyle() {
		actor.setHairStyle("��ͷ");
	}
}
