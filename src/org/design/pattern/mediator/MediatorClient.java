package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-10下午5:11:48
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
		
		System.out.println("--------点击按钮---------");
		button.changed();
		System.out.println("--------选中组合框---------");
		comboBox.changed();
		System.out.println("--------选中列表框---------");
		listBox.changed();
	}
	
}
