/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: Base.java
 * Author:   Administrator
 * Date:     2015年10月9日 下午7:24:04
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
public class Base {
	private String baseName = "base";
	public Base(){
		callName();
	}
	public void callName(){
		System.out.println(baseName);
	}
	static class Sub extends Base{
		private String baseName = "sub";
		public void callName(){
			System.out.println(baseName);
		}
	}
	
	public static void main(String[] args) {
		Base b = new Sub();
	}
}
