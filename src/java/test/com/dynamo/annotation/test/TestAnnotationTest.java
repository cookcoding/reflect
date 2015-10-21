/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: TestAnnotationTest.java
 * Author:   Administrator
 * Date:     2015年9月10日 下午8:35:40
 * Description: 
 */
package com.dynamo.annotation.test;

import java.io.IOException;

import org.junit.Test;

import com.dynamo.annotation.TestAnnotation;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@TestAnnotation
public class TestAnnotationTest {
	
	@Test
	public void test()
	        throws InterruptedException, NoSuchFieldException, IllegalAccessException, IOException {
		TestAnnotation annotation = TestAnnotationTest.class.getAnnotation(TestAnnotation.class);
		System.out.println(annotation.count());
		System.in.read();
	}
	
	@Test
	public void test1()
	        throws InterruptedException, NoSuchFieldException, IllegalAccessException, IOException {
		TestAnnotation annotation = TestAnnotationTest.class.getAnnotation(TestAnnotation.class);
		System.out.println(annotation.count());
		System.in.read();
	}
}
