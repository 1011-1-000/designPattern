package org.design.pattern.bridge;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����1:30:41
 */
public class BMPImage extends Image{

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName+"BMP��ʽ�Ѵ���");
	}

}
