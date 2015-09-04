package org.design.pattern.singleton;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @desciption: 负载均衡器LoadBalancer：单例类，真实环境下该类将非常复杂，包括大量
 * 初始化的工作和业务方法，考虑到代码的可读性和易理解性，只列出部分与模式相关的核心
 * 代码
 * 此单例的一个问题是在多线程中，无法保证单例
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-4下午4:09:39
 */
public class LoadBalancer {
	private static LoadBalancer instance = null;
	List<String> serverList = null;
	
	private LoadBalancer(){
		serverList = new LinkedList<String>();
	}
	
	public static LoadBalancer getLoadBalancer(){
		if(instance == null){
			instance = new LoadBalancer();
		}
		return instance;
	}
	
	public void addServer(String server){
		serverList.add(server);
	}
	
	public void deleteServer(String server){
		serverList.remove(server);
	}
	
	public String getServer(){
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return serverList.get(i);
	}
}
