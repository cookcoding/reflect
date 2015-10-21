/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: Person.java
 * Author:   Administrator
 * Date:     2015年9月9日 上午10:56:49
 * Description: 
 */
package com.dynamo.domain;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Person {
	private String name;
	private int age;

	/**
	 * 
	 */
	public Person() {
	}

	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}

}
