package org.design.pattern.factory.abstractt;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-3ÏÂÎç10:15:18
 */
public class SummerSkinFactory implements SkinFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SummerButton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SummerTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SummerComboBox();
	}

}
