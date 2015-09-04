package org.design.pattern.prototype;

import java.util.Date;

/**
 * @desciption: 日志实体类，要实现复制，须实现cloneable接口
 * 这种方式实现的为浅克隆，即对引用对象不会新建
 * @author : 黄应翔(http://passwarer.github.io/)
 * @date : 2015-9-4下午5:02:34
 */
public class WeeklyLog implements Cloneable{
	private String name;
	private Date date;
	private String content;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	//实现clone方法
	public WeeklyLog clone(){
		Object obj = null;
		try{
			obj = super.clone();
			return (WeeklyLog) obj;
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
			return null;
		}
	}
	//为了测试写个toString方法
	@Override
	public String toString() {
		return "WeeklyLog [name=" + name + ", date=" + date + ", content="
				+ content + "]";
	}
}
