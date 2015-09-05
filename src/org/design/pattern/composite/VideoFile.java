package org.design.pattern.composite;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-5下午2:43:13
 */
public class VideoFile extends AbstractFile{
	
	private String name;
	
	public VideoFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("文件"+name+"正在杀毒...");
	}

}
