package org.design.pattern.proxy;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-6����3:35:58
 */
public class AccessValidator {
	public boolean validate(String userId){
		if(userId.equals("leo")){
			System.out.println("��¼�ɹ�");
			return true;
		}
		else{
			System.out.println("��¼ʧ��");
			return false;
		}
	}
}
