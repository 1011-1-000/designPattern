package org.design.pattern.proxy;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-6下午3:42:38
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
	
	//创建访问验证对象并调用其Validate()方法实现身份验证  
    public boolean validate(String userId)  
    {  
        av = new AccessValidator();  
        return av.validate(userId);  
    }  

    //创建日志记录对象并调用其Log()方法实现日志记录  
    public void log(String userId)  
    {  
        logger = new Logger();  
        logger.log(userId);  
    }  

}
