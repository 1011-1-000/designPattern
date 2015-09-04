package org.design.pattern.prototype;

import java.util.Iterator;
import java.util.Map;

import org.design.pattern.XMLUtil3;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-4ÏÂÎç5:30:56
 */
public class PrototypeManager {
	private Hashtable ht = new Hashtable();
	private static PrototypeManager pm = new PrototypeManager();
	
	private PrototypeManager(){
		Map<String,Object> map = XMLUtil3.getBean("prototype/config.xml","document");
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry)iter.next();
			ht.put(entry.getKey(), (OfficialDocument)entry.getValue());
		}
	}
	
	public void addOfficalDocument(String key,OfficialDocument doc){
		ht.put(key, doc);
	}
	
	public OfficialDocument getOfficalDocument(String key){
		return ((OfficialDocument)ht.get(key)).clone();
	}
	
	public static PrototypeManager getPrototypeManager(){
		return pm;
	}
}

