package org.design.pattern.proxy;

import org.design.pattern.XMLUtil2;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-6����3:49:35
 */
public class ProxyClient {
	public static void main(String[] args){
		Searcher searcher = (Searcher)XMLUtil2.getBean("proxy/config.xml", "proxyClass");
		System.out.println(searcher.doSearch("leo"));
	}
}
