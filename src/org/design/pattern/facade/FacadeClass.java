package org.design.pattern.facade;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-6ÏÂÎç1:40:16
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
