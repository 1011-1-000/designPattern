package org.design.pattern.facade;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-6ÏÂÎç2:26:03
 */
public class NewFacadeClass extends AbstractFacadeClass{

	private FileReader fileReader;
	private NewFileCipher fileCipher;
	private FileWriter fileWriter;
	
	public NewFacadeClass(){
		fileReader = new FileReader();
		fileCipher = new NewFileCipher();
		fileWriter = new FileWriter();
	}
	
	@Override
	public void fileEncrypt(){
		fileReader.read();
		fileCipher.cipher();
		fileWriter.write();
	}

}
