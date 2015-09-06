package org.design.pattern.flyweight;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-6下午2:58:38
 */
public abstract class IgoChessman {
	public abstract String getColor();
	
	public void display(Coordinates c){
		System.out.println("棋子颜色："+this.getColor()+"|坐标：("+c.getX()+","+c.getY()+")");
	}
}
