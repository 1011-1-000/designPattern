package org.design.pattern.proxy;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-6����3:42:38
 */
public class ProxySearcher implements Searcher{
	
	private RealSearcher real = new RealSearcher();
	private AccessValidator av;
	private Logger logger;
	
	@Override
	public String doSearch(String userId) {
		// TODO Auto-generated method stub
		if(validate(userId)){
			String result = real.doSearch(userId);
			log(userId);
			return result;
		}
		else{
			return null;
		}
	}
	
	//����������֤���󲢵�����Validate()����ʵ�������֤  
    public boolean validate(String userId)  
    {  
        av = new AccessValidator();  
        return av.validate(userId);  
    }  

    //������־��¼���󲢵�����Log()����ʵ����־��¼  
    public void log(String userId)  
    {  
        logger = new Logger();  
        logger.log(userId);  
    }  

}
