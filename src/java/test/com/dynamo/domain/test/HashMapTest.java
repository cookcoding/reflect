/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: HashMapTest.java
 * Author:   Administrator
 * Date:     2015年9月16日 下午6:16:29
 * Description: 
 */
package com.dynamo.domain.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.dynamo.domain.HashMapEqualsDiff;
import com.dynamo.domain.HashMapHashCodeDiff;

/**
 * 〈一句话是什么〉<br> 
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class HashMapTest {
	//为了验证对象里面的值是一样的，但是hashcode的值不一样，hashmap会不会覆盖
	@Test
	public void test(){
		Map<HashMapHashCodeDiff,String> map = new HashMap<>();
		HashMapHashCodeDiff hm1 = new HashMapHashCodeDiff(1, "1");
		map.put(hm1, "1");
		HashMapHashCodeDiff.hashOffset ++ ;
		HashMapHashCodeDiff hm2 = new HashMapHashCodeDiff(1, "1");
		map.put(hm2, "1");
		
		System.out.println(map.size());
	}
	
	//为了验证对象里面的值是一样的，但是hashcode的值不一样，hashmap会不会覆盖
	@Test
	public void test1(){
		Map<HashMapEqualsDiff,String> map = new HashMap<>();
		HashMapEqualsDiff hm1 = new HashMapEqualsDiff(1, "1");
		HashMapEqualsDiff hm2 = new HashMapEqualsDiff(1, "1");
		map.put(hm1, "1");
		map.put(hm2, "1");
		System.out.println(map.size());
	}
}
