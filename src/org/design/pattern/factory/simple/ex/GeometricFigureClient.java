package org.design.pattern.factory.simple.ex;

import org.design.pattern.XMLUtil;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-3ÏÂÎç5:39:37
 */
public class GeometricFigureClient {
	public static void main(String[] args){
		String geometricType = XMLUtil.getType("/factory/simple/ex/config.xml", "geometricType");
		GeometricFigure g = GeometricFigure.getGeometricFigure(geometricType);
		g.draw();
	}
}
