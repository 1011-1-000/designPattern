package org.design.pattern.factory.simple.ex;

/**
 * @desciption: ����ļ���ͼ����
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-3����5:31:25
 */
public abstract class GeometricFigure {
	
	public void erase(){
		System.out.println("����ͼ��");
	}
	
	public abstract void draw();
	
	public static GeometricFigure  getGeometricFigure(String type){
		GeometricFigure geometricFigure = null;
		if(type.equalsIgnoreCase("circle")){
			geometricFigure = new Circle();
			System.out.println("��ʼ��Բ��");
		} else if(type.equalsIgnoreCase("square")){
			geometricFigure = new Square();
			System.out.println("��ʼ������");
		} else if(type.equalsIgnoreCase("triangle")){
			geometricFigure = new Triangle();
			System.out.println("��ʼ��������");
		}
		return geometricFigure;
	}
}
