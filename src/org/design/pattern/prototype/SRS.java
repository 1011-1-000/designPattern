package org.design.pattern.prototype;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-4����5:44:50
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
                  System.out.println("��֧�ָ��ƣ�");
           }
           return  srs;
    }
   
    public  void display()
    {
           System.out.println("�����������˵���顷");
    }
}
