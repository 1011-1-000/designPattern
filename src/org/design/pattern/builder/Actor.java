package org.design.pattern.builder;

/**
 * @desciption: 游戏角色实体类
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5上午10:48:28
 */
public class Actor {
	private String type;
	private String sex;
	private String face;
	private String costume;
	private String hairStyle;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getCostume() {
		return costume;
	}
	public void setCostume(String costume) {
		this.costume = costume;
	}
	public String getHairStyle() {
		return hairStyle;
	}
	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}
	@Override
	public String toString() {
		return "Actor [type=" + type + ", sex=" + sex + ", face=" + face
				+ ", costume=" + costume + ", hairStyle=" + hairStyle + "]";
	}
}
