/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: ReflectGetConstruct.java
 * Author:   Administrator
 * Date:     2015年9月17日 下午5:48:21
 * Description: 
 */
package com.dynamo.domain.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ReflectGetConstruct {

	@Test
	public void test() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
	        IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException {
		Class<?> clazz = Class.forName("com.dynamo.domain.Lion");
		Object object = clazz.newInstance();
		System.out.println(object);

		// class的getConstructors()获取类的构造器
		Constructor[] constructors = clazz.getConstructors();
		System.out.println("构造函数有：");
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}

		// 获得方法
		System.out.println("方法有：");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}

		// 属性有哪些
		System.out.println("属性有：");
		Field f[] = clazz.getDeclaredFields();
		for (Field field : f) {
			System.out.println(field.getName());
		}

		// 更加配置参数，设置属性值
		System.out.println("属性设置结果");
		String param = "setName";
		for (Method method : methods) {
			if (method.getName().equals(param)) {
				method.invoke(object, "shilei");
				break;
			}
		}
		System.out.println(object);

		// 通过属性获取类实例变量属性值
		System.out.println("反射获取属性值");

		Field field = null;
		for (int i = 0; i < f.length; i++) {
			field = f[i];
			field.setAccessible(true);// 修改访问权限
			System.out.println(field.getName() + ":" + field.get(object));// 读取属性值
		}

	}
}
