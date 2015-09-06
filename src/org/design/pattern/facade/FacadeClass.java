package org.design.pattern.facade;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-6����1:40:16
 */
public class FacadeClass extends AbstractFacadeClass{
	private FileReader fileReader;
	private FileCipher fileCipher;
	private FileWriter fileWriter;
	
	public FacadeClass(){
		fileReader = new FileReader();
		fileCipher = new FileCipher();
		fileWriter = new FileWriter();
	}
	
	@Override
	public void fileEncrypt(){
		fileReader.read();
		fileCipher.cipher();
		fileWriter.write();
	}
}
