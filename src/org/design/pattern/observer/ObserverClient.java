package org.design.pattern.observer;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-11上午12:13:20
 */
public class ObserverClient {
	public static void main(String[] args){
		AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠战队");
		Observer player1 = new Player("杨过");
		acc.join(player1);
		Observer player2 = new Player("令狐冲");
		acc.join(player2);
		Observer player3 = new Player("张无忌");
		acc.join(player3);
		Observer player4 = new Player("段誉");
		acc.join(player4);
		
		player3.beAttacked(acc);
	}
}
