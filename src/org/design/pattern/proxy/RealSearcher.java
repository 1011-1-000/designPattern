package org.design.pattern.proxy;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-6����3:41:19
 */
public class RealSearcher implements Searcher{

	@Override
	public String doSearch(String userId) {
		// TODO Auto-generated method stub
		System.out.println("�û�"+userId+"���ڲ�ѯ��Ϣ");
		return "�������ݿ���Ϣ��ѯ���";
	}

}	
