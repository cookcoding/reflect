/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: DifferentBetweenGetMethodsAndGetDeclareMethods.java
 * Author:   Administrator
 * Date:     2015年10月21日 下午4:16:19
 * Description: 
 */
package com.dynamo.domain.test;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.junit.Test;

import com.dynamo.domain.Lion;

/**
 * 〈一句话是什么〉<br> 
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DifferentBetweenGetMethodsAndGetDeclaredMethods {
	@Test
	public void test1(){
		Lion lion = new Lion();
		Method[] methods = lion.getClass().getMethods();
		Method[] declareMethods = lion.getClass().getDeclaredMethods();
		
		
		System.out.println(Arrays.toString(methods));
		System.out.println("--");
		System.out.println(Arrays.toString(declareMethods));
	}
}
