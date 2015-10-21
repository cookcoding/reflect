/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: Lion.java
 * Author:   Administrator
 * Date:     2015年9月17日 下午5:53:09
 * Description: 
 */
package com.dynamo.domain;

import java.io.Serializable;

/**
 * 〈一句话是什么〉<br> 
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Lion implements Serializable{
	private static final long serialVersionUID = 2L;
	public String beLook;
	private String name;
	private int age;
	/**
	 * 
	 */
	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param beLook
	 * @param name
	 * @param age
	 */
	public Lion(String beLook, String name, int age) {
		super();
		this.beLook = beLook;
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the beLook
	 */
	public String getBeLook() {
		return beLook;
	}
	/**
	 * @param beLook the beLook to set
	 */
	public void setBeLook(String beLook) {
		this.beLook = beLook;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Lion [beLook=" + beLook + ", name=" + name + ", age=" + age + "]";
	}
}
