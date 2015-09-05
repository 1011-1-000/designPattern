package org.design.pattern.composite;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����2:43:13
 */
public class TextFile extends AbstractFile{
	
	private String name;

	public TextFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("�ļ�"+name+"����ɱ��...");
	}

}
