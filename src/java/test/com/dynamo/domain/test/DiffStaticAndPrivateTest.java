package com.dynamo.domain.test;

import org.junit.Test;

import com.dynamo.domain.StaticClass;

public class DiffStaticAndPrivateTest {
	@Test
	public void test1(){
		StaticClass staticClass0 = new StaticClass();
		staticClass0.staticValue = 1;
		staticClass0.setPrivateValue(1);
		System.out.println(staticClass0.toString());
		
		StaticClass staticClass1 = new StaticClass();
		staticClass1.setPrivateValue(2);
		System.out.println(staticClass1.toString());
		
	}
}
