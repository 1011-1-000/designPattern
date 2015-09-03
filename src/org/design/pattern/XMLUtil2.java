package org.design.pattern;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-3ÏÂÎç8:35:16
 */
public class XMLUtil2 {
	private static String path = System.getProperty("user.dir")+"/src/org/design/pattern/";
	public static Object getBean(String relativePath,String nodeName){
		try{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File(path+relativePath));
			
			NodeList nl = doc.getElementsByTagName(nodeName);
			Node classNode = nl.item(0).getFirstChild();
			String className = classNode.getNodeValue().trim();
			
			Class clazz = Class.forName(className);
			Object obj = clazz.newInstance();
			return obj;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
