package org.design.pattern.prototype;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-4下午5:44:22
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
                     System.out.println("不支持复制！");
             }
             return  far;
      }
     
      public  void display()
      {
             System.out.println("《可行性分析报告》");
      }
}
