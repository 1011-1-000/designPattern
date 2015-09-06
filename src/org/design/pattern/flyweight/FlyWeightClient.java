package org.design.pattern.flyweight;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-6����3:08:16
 */
public class FlyWeightClient {
	public static void main(String args[]) {  
        IgoChessman black1,black2,black3,white1,white2;  
        IgoChessmanFactory factory;  
          
        //��ȡ��Ԫ��������  
        factory = IgoChessmanFactory.getInstance();  
  
        //ͨ����Ԫ������ȡ���ź���  
        black1 = factory.getIgoChessman("black");  
        black2 = factory.getIgoChessman("black");  
        black3 = factory.getIgoChessman("black");  
        System.out.println("�ж����ź����Ƿ���ͬ��" + (black1==black2));  
  
        //ͨ����Ԫ������ȡ���Ű���  
        white1 = factory.getIgoChessman("white");  
        white2 = factory.getIgoChessman("white");  
        System.out.println("�ж����Ű����Ƿ���ͬ��" + (white1==white2));  
  
        //��ʾ����  
        black1.display(new Coordinates(1, 2));  
        black2.display(new Coordinates(4, 7));  
        black3.display(new Coordinates(6, 9));  
        white1.display(new Coordinates(3, 12));  
        white2.display(new Coordinates(11,22));  
    }  
}
