package org.design.pattern.prototype;

import java.io.IOException;
import java.util.Date;

/**
 * @desciption: No description
 * @author : ª∆”¶œË(http://passwarer.github.io/)
 * @date : 2015-9-4œ¬ŒÁ5:07:15
 */
public class WeeklyLogClient {
	public static void main(String[] args){
		WeeklyLogDeepClone wl = new WeeklyLogDeepClone();
		wl.setContent("≤‚ ‘");
		wl.setDate(new Date());
		wl.setName("Leo");
		System.out.println(wl);
		WeeklyLogDeepClone wl_new = null;
		try {
			wl_new = wl.deepClone();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(wl_new);
		System.out.println(wl == wl_new);
		System.out.println(wl.getContent() == wl_new.getContent());
		System.out.println(wl.getDate() == wl_new.getDate());
		System.out.println(wl.getName() == wl_new.getName());
	}
}
