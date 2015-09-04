package org.design.pattern.prototype;

import java.util.Date;

/**
 * @desciption: ��־ʵ���࣬Ҫʵ�ָ��ƣ���ʵ��cloneable�ӿ�
 * ���ַ�ʽʵ�ֵ�Ϊǳ��¡���������ö��󲻻��½�
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-4����5:02:34
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
	
	//ʵ��clone����
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
	//Ϊ�˲���д��toString����
	@Override
	public String toString() {
		return "WeeklyLog [name=" + name + ", date=" + date + ", content="
				+ content + "]";
	}
}
