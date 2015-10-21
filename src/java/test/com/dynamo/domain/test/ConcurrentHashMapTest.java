/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: ConcurrentHashMap.java
 * Author:   Administrator
 * Date:     2015年9月17日 下午7:59:46
 * Description: 
 */
package com.dynamo.domain.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

/**
 * 〈一句话是什么〉<br> 
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ConcurrentHashMapTest {
	@Test
	public void test1(){
		Map<String,String> map = new ConcurrentHashMap<String,String>();
	}
}
