package org.design.pattern.bridge;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5下午1:27:44
 */
public class UnixImp implements ImageImpl{

	@Override
	public void doPaint(Matrix m) {
		// TODO Auto-generated method stub
		System.out.println("Unix系统绘图");
	}

}
