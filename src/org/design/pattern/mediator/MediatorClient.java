package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-10����5:11:48
 */
public class MediatorClient {
	
	public static void main(String[] args){
		Component button = new Button();
		Component comboBox = new ComboBox();
		Component listBox = new ListBox();
		Component textBox = new TextBox();
		
		Mediator mediator = new ConcreteMediator(button, listBox, textBox, comboBox);
		button.setMediator(mediator);
		comboBox.setMediator(mediator);
		listBox.setMediator(mediator);
		textBox.setMediator(mediator);
		
		System.out.println("--------�����ť---------");
		button.changed();
		System.out.println("--------ѡ����Ͽ�---------");
		comboBox.changed();
		System.out.println("--------ѡ���б��---------");
		listBox.changed();
	}
	
}
