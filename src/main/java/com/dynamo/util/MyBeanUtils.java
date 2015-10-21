/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: MyBeanUtils.java
 * Author:   Administrator
 * Date:     2015年10月21日 下午2:33:05
 * Description: 
 */
package com.dynamo.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.FatalBeanException;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

/**
 * 〈一句话是什么〉<br> 
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MyBeanUtils {
	
	public static void copyProperties(Object source, Object target) {

		Assert.notNull(source, "Source must not be null");
		Assert.notNull(target, "Target must not be null");

		//获取目标对象的类
		Class<?> actualEditable = target.getClass();
		
		//获取源对象的类
		Class<?> sourceEditable = source.getClass();

		//获取目标对象的所有set方法，为赋值做准备
		Method[] setMethods = getSetMethods(actualEditable);

		//遍历每一个目标对象的set方法，查看源对象中是否有对应的get方法，如果有，取出值，再将值赋值给目标对象
		for (Method method : setMethods) {
			//根据目标对象的set方法，查看源对象中是否有该属性的get方法
			Method readMethod = getGetMethodBySetMethod(sourceEditable,method);
			
			if (readMethod != null &&
					ClassUtils.isAssignable(method.getParameterTypes()[0], readMethod.getReturnType())) {
				//如果找到get属性的方法，将该get方法设置为可通过反射读取
				try {
					if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
						readMethod.setAccessible(true);
					}
					//获取源对象的属性值
					Object value = readMethod.invoke(source);
					//将目标对象的set方法设置为可调用
					if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
						method.setAccessible(true);
					}
					//通过反射的set方法，将获取的属性值赋值给目标对象
					method.invoke(target, value);
				}
				catch (Throwable ex) {
					throw new FatalBeanException(
							"Could not copy property '" + method.getName() + "' from source to target", ex);
				}
			}
		}
	}
	
	private static Method[] getSetMethods(Class<?> zlass){
		Method[] sourceGetList = zlass.getMethods();
		Method[] list = new Method[sourceGetList.length];
		int index = 0;
		for (Method method : sourceGetList) {
			if(method.getName().startsWith("set")){
				list[index++] = method;
			}
		}
		return list;
	}
	
	/**
	 *根据set方法，获取属性名，在源对象中查找该属性的get方法
	 *
	 *例如：出入 setName方法，获取Name属性名，在zlass中查找是否有getName()方法存在
	 */
	private static Method getGetMethodBySetMethod(Class<?> zlass,Method setMethod){
		if(null == zlass || null == setMethod){
			return null;
		}
		Method[] sourceGetList = zlass.getDeclaredMethods();
		//在此组装getName方法名
		String getMethodName = setMethod.getName().replaceFirst("set", "get");
		for (Method method : sourceGetList) {
			if(method.getName().equals(getMethodName)){
				return method;
			}
		}
		return null;
	}
	
}
