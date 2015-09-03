package org.design.pattern.factory.method;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午7:55:47
 */
public class FileLogger implements Logger{

	@Override
	public void writeLog() {
		// TODO Auto-generated method stub
		System.out.println("向文件写入日志");
	}

}
