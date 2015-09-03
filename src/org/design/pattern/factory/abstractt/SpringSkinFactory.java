package org.design.pattern.factory.abstractt;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-3����10:14:00
 */
public class SpringSkinFactory implements SkinFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SpringButton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SpringComboBox();
	}

}
