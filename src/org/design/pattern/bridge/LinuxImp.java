package org.design.pattern.bridge;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5下午1:26:59
 */
public class LinuxImp implements ImageImpl{

	@Override
	public void doPaint(Matrix m) {
		// TODO Auto-generated method stub
		System.out.println("Linux系统绘图");
	}

}
