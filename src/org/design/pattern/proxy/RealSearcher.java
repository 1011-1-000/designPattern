package org.design.pattern.proxy;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-6下午3:41:19
 */
public class RealSearcher implements Searcher{

	@Override
	public String doSearch(String userId) {
		// TODO Auto-generated method stub
		System.out.println("用户"+userId+"正在查询信息");
		return "返回数据库信息查询结果";
	}

}	
