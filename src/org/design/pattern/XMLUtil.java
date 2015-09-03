package org.design.pattern;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @desciption: 从XML文件中读取配置，以实现开闭原则
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-3下午4:55:11
 */
public class XMLUtil {
	
	private static String nodeString = null;
	private static String path = System.getProperty("user.dir")+"/src/org/design/pattern/";
	@SuppressWarnings("finally")
	public static String getType(String relativePath,String nodeName){
		try{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File(path+relativePath));
			
			NodeList nl = doc.getElementsByTagName(nodeName);
			Node classNode = nl.item(0).getFirstChild();
			nodeString = classNode.getNodeValue().trim();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			return nodeString;
		}
	}
}
