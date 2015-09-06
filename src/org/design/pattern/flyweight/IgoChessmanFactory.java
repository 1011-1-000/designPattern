package org.design.pattern.flyweight;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-6ÏÂÎç3:03:31
 */
public class IgoChessmanFactory {
	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	private static Hashtable ht;
	
	private IgoChessmanFactory(){
		ht = new Hashtable();
		IgoChessman black,white;
		black = new BlackIgoChessman();
		white = new WhiteIgoChessman();
		
		ht.put("black", black);
		ht.put("white", white);
	}
	
	public static IgoChessmanFactory getInstance(){
		return instance;
	}
	
	public IgoChessman getIgoChessman(String color){
		return (IgoChessman)ht.get(color);
	}
}
