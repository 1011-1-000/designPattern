package org.design.pattern.prototype;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-4下午5:44:50
 */
public class SRS implements OfficialDocument{
	public  OfficialDocument clone()
    {
           OfficialDocument  srs = null;
           try
           {
                  srs  = (OfficialDocument)super.clone();
           }
           catch(CloneNotSupportedException  e)
           { 
                  System.out.println("不支持复制！");
           }
           return  srs;
    }
   
    public  void display()
    {
           System.out.println("《软件需求规格说明书》");
    }
}
