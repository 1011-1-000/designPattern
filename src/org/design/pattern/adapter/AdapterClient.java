package org.design.pattern.adapter;

import org.design.pattern.XMLUtil2;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-5ÉÏÎç11:36:58
 */
public class AdapterClient {
	public static void main(String[] args){
		int[] array = {1,2};
		ScoreOperation so = (ScoreOperation)XMLUtil2.getBean("adapter/config.xml", "className");
		so.sort(array);
		so.search(array, 1);
	}
}
