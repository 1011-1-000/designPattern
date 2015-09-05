package org.design.pattern.bridge;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5下午1:28:56
 */
public class JPGImage extends Image{

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName+"JPG格式已处理");
	}

}
