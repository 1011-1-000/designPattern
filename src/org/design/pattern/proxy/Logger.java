package org.design.pattern.proxy;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-6下午3:38:49
 */
public class Logger {
	public void log(String userId){
		System.out.println(userId+"查询次数加1，插入数据库");
	}
}
