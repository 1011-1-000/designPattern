package org.design.pattern.factory.method;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午8:48:34
 */
public class CosoleLogger implements Logger{

	@Override
	public void writeLog() {
		// TODO Auto-generated method stub
		System.out.println("向控制台写入日志");
	}
	
}
