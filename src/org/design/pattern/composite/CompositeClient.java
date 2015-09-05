package org.design.pattern.composite;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-5����2:51:02
 */
public class CompositeClient {
	public static void main(String[] args){
		AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;  
        
        folder1 = new Folder("Sunny������");  
        folder2 = new Folder("ͼ���ļ�");  
        folder3 = new Folder("�ı��ļ�");  
        folder4 = new Folder("��Ƶ�ļ�");  
          
        file1 = new ImageFile("С��Ů.jpg");  
        file2 = new ImageFile("���޼�.gif");  
        file3 = new TextFile("�����澭.txt");  
        file4 = new TextFile("��������.doc");  
        file5 = new VideoFile("Ц������.rmvb");  
  
        folder2.add(file1);  
        folder2.add(file2);  
        folder3.add(file3);  
        folder3.add(file4);  
        folder4.add(file5);  
        folder1.add(folder2);  
        folder1.add(folder3);  
        folder1.add(folder4);  
          
        //�ӡ�Sunny�����ϡ��ڵ㿪ʼ����ɱ������  
        folder1.killVirus();  
	}
}
