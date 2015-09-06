package org.design.pattern.flyweight;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-6下午3:08:16
 */
public class FlyWeightClient {
	public static void main(String args[]) {  
        IgoChessman black1,black2,black3,white1,white2;  
        IgoChessmanFactory factory;  
          
        //获取享元工厂对象  
        factory = IgoChessmanFactory.getInstance();  
  
        //通过享元工厂获取三颗黑子  
        black1 = factory.getIgoChessman("black");  
        black2 = factory.getIgoChessman("black");  
        black3 = factory.getIgoChessman("black");  
        System.out.println("判断两颗黑子是否相同：" + (black1==black2));  
  
        //通过享元工厂获取两颗白子  
        white1 = factory.getIgoChessman("white");  
        white2 = factory.getIgoChessman("white");  
        System.out.println("判断两颗白子是否相同：" + (white1==white2));  
  
        //显示棋子  
        black1.display(new Coordinates(1, 2));  
        black2.display(new Coordinates(4, 7));  
        black3.display(new Coordinates(6, 9));  
        white1.display(new Coordinates(3, 12));  
        white2.display(new Coordinates(11,22));  
    }  
}
