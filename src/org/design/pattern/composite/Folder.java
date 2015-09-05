package org.design.pattern.composite;

import java.util.ArrayList;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����2:44:37
 */
public class Folder extends AbstractFile{
	
	private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
	private String name;
	
	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.add(file);
	}



	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.remove(file);
	}



	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		return fileList.get(i);
	}



	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("�ļ���"+name+"����ɱ��");
		for(AbstractFile file : fileList){
			file.killVirus();
		}
	}

}
