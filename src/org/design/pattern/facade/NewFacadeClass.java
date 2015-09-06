package org.design.pattern.facade;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-6����2:26:03
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
