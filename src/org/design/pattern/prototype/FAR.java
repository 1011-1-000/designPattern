package org.design.pattern.prototype;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-4����5:44:22
 */
public class FAR implements OfficialDocument{
	 public  OfficialDocument clone()
     {
             OfficialDocument  far = null;
             try
             {
                    far  = (OfficialDocument)super.clone();
             }
             catch(CloneNotSupportedException  e)
             {
                     System.out.println("��֧�ָ��ƣ�");
             }
             return  far;
      }
     
      public  void display()
      {
             System.out.println("�������Է������桷");
      }
}
