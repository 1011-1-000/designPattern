package org.design.pattern.singleton;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @desciption: ���ؾ�����LoadBalancer�������࣬��ʵ�����¸��ཫ�ǳ����ӣ���������
 * ��ʼ���Ĺ�����ҵ�񷽷������ǵ�����Ŀɶ��Ժ�������ԣ�ֻ�г�������ģʽ��صĺ���
 * ����
 * �˵�����һ���������ڶ��߳��У��޷���֤����
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-4����4:09:39
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
