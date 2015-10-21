/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: CoreTest.java
 * Author:   Administrator
 * Date:     2015年9月10日 下午5:27:01
 * Description: 
 */
package com.dynamo.domain.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.tomcat.util.codec.binary.StringUtils;
import org.junit.Test;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CoreTest {
	class A {
		int i = 1;

		void print() {
			System.out.println(i);
		}
	}

	class B extends A {
		int i = 2;

		void print() {
			System.out.println(i);
		}
	}

	@Test
	public void test() {
		B b = new B();
		System.out.println(b.i);
	}

	@Test
	public void test1() {
		StringUtils stringUtils = new StringUtils();
	}

	@Test
	public void test2() {
		System.out.println(1111 & 0001);
		System.out.println(1111 & 10001);
		System.out.println(1 << 2);
	}

	@Test
	public void test3() {
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		HashMap p;
	}
	
	@Test
	public void test4(){
		String setMethod = "setName";
		System.out.println(Arrays.toString(setMethod.split("set")));
	}

}
