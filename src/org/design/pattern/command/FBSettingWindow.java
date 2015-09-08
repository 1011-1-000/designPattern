package org.design.pattern.command;

import java.util.ArrayList;

/**
 * @desciption: No description
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-8下午2:40:27
 */
public class FBSettingWindow {
	private String title;
	private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();
	public FBSettingWindow(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void addFunctionButton(FunctionButton fb){
		functionButtons.add(fb);
	}
	
	public void removeFunctionButton(FunctionButton fb){
		functionButtons.remove(fb);
	}
	
	public void display() {  
        System.out.println("显示窗口：" + this.title);  
        System.out.println("显示功能键：");  
        for (Object obj : functionButtons) {  
            System.out.println(((FunctionButton)obj).getName());  
        }  
        System.out.println("------------------------------");  
    }   
}
