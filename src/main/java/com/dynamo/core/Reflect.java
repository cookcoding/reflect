package com.dynamo.core;

import java.lang.reflect.Field;
import java.util.Arrays;

import org.junit.Test;

import com.dynamo.domain.MyClass;
import com.dynamo.domain.Person;

public class Reflect {

	// 通过一个对象获得完整的包名和类名
	@Test
	public void test1() {
		MyClass MyClass = new MyClass();
		System.out.println(MyClass.getClass().getName());
	}

	// 实例化Class类对象
	@Test
	public void test2() {
		Class<?> myClass1 = null;
		Class<?> myClass2 = null;
		Class<?> myClass3 = null;

		try {
			myClass1 = Class.forName("com.dynamo.domain.MyClass");
		} catch (Exception e) {
			e.printStackTrace();
		}

		myClass2 = new MyClass().getClass();
		myClass3 = MyClass.class;

		System.out.println("class name:" + myClass1);
		System.out.println("class name:" + myClass2);
		System.out.println("class name:" + myClass3);
	}

	// 通过无参构造实例化对象
	@Test
	public void test3() {
		Class<?> preson = null;
		try {
			preson = Class.forName("com.dynamo.domain.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person per = null;
		try {
			per = (Person) preson.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		per.setName("Rollen");
		per.setAge(20);
		System.out.println(per);
	}
	
	//通过反射，获取变量并复制
	@Test
	public void test4(){
		Class<?> preson = null;
		try {
			preson = Class.forName("com.dynamo.domain.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Field[] fields = preson.getFields();
		System.out.println(Arrays.toString(fields));
	}
}
