package org.design.pattern.proxy;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-6ÏÂÎç3:35:58
 */
public class AccessValidator {
	public boolean validate(String userId){
		if(userId.equals("leo")){
			System.out.println("µÇÂ¼³É¹¦");
			return true;
		}
		else{
			System.out.println("µÇÂ¼Ê§°Ü");
			return false;
		}
	}
}
