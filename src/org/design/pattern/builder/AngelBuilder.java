package org.design.pattern.builder;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5上午10:59:07
 */
public class AngelBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("天使");
	}

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		 actor.setSex("女");
	}

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("漂亮");
	}

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("白裙");
	}

	@Override
	public void buildHairStyle() {
		// TODO Auto-generated method stub
		actor.setHairStyle("披肩长发");
	}

}
