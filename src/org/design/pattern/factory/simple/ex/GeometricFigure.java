package org.design.pattern.factory.simple.ex;

/**
 * @desciption: 抽象的几何图形类
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午5:31:25
 */
public abstract class GeometricFigure {
	
	public void erase(){
		System.out.println("擦除图形");
	}
	
	public abstract void draw();
	
	public static GeometricFigure  getGeometricFigure(String type){
		GeometricFigure geometricFigure = null;
		if(type.equalsIgnoreCase("circle")){
			geometricFigure = new Circle();
			System.out.println("初始化圆形");
		} else if(type.equalsIgnoreCase("square")){
			geometricFigure = new Square();
			System.out.println("初始化方形");
		} else if(type.equalsIgnoreCase("triangle")){
			geometricFigure = new Triangle();
			System.out.println("初始化三角形");
		}
		return geometricFigure;
	}
}
