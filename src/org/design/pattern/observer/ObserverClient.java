package org.design.pattern.observer;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-11����12:13:20
 */
public class ObserverClient {
	public static void main(String[] args){
		AllyControlCenter acc = new ConcreteAllyControlCenter("��ӹȺ��ս��");
		Observer player1 = new Player("���");
		acc.join(player1);
		Observer player2 = new Player("�����");
		acc.join(player2);
		Observer player3 = new Player("���޼�");
		acc.join(player3);
		Observer player4 = new Player("����");
		acc.join(player4);
		
		player3.beAttacked(acc);
	}
}
