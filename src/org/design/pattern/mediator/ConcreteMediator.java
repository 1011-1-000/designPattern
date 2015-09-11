package org.design.pattern.mediator;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-10ÏÂÎç5:07:00
 */
public class ConcreteMediator extends Mediator{
	
	private Component button;
	private Component listBox;
	private Component textBox;
	private Component comboBox;
	
	public ConcreteMediator(Component button, Component listBox, Component textBox,
			Component comboBox) {
		this.button = button;
		this.listBox = listBox;
		this.textBox = textBox;
		this.comboBox = comboBox;
	}

	@Override
	public void componentChanged(Component c) {
		// TODO Auto-generated method stub
		if(c == button){
			listBox.updated();
			comboBox.updated();
			textBox.updated();
		}
		else if(c == listBox){
			textBox.updated();
		}
		else if(c == comboBox){
			textBox.updated();
		}
	}

}
