package org.design.pattern;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-3ÏÂÎç8:35:16
 */
public class XMLUtil3 {
	private static String path = System.getProperty("user.dir")+"/src/org/design/pattern/";
	public static Map<String,Object> getBean(String relativePath,String nodeName){
		try{
			Map<String,Object> map = new HashMap<String,Object>();
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File(path+relativePath));
			
			NodeList documents = doc.getElementsByTagName(nodeName);
			System.out.println(documents.getLength());
			for(int i = 0; i < documents.getLength(); i++){
					Element element = (Element)documents.item(i);
					String type = element.getElementsByTagName("type").item(0).getFirstChild().getNodeValue().trim();
					String className = element.getElementsByTagName("className").item(0).getFirstChild().getNodeValue().trim();
					Class clazz = Class.forName(className);
					Object obj = clazz.newInstance();
					map.put(type, obj);
			}
			return map;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
