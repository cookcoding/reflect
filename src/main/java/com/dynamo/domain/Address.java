/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: Address.java
 * Author:   Administrator
 * Date:     2015年9月18日 上午9:10:59
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
public class Address implements Serializable {
	private static final long serialVersionUID = 2L;

	String name;
//	String country;
//	int age;

	public void setName(String name) {
		this.name = name;
	}

//	public void setCountry(String country) {
//		this.country = country;
//	}
//
	public String getName() {
		return this.name;
	}
//
//	public String getCountry() {
//		return this.country;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	@Override
	public String toString() {
		return new StringBuffer(" name : ").append(this.name).append(" Country : ").toString();//.append(this.country).toString();
	}
}
