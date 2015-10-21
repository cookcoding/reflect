/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: FrutiRun.java
 * Author:   Administrator
 * Date:     2015年9月18日 下午1:55:05
 * Description: 
 */
package com.dynamo.annotation.test;

import com.dynamo.util.FruitInfoUtil;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class FrutiRun {
	public static void main(String[] args) throws ClassNotFoundException {
		String className = "com.dynamo.domain.Apple";
		Class<?> clazz = Class.forName(className);
		FruitInfoUtil.getFruitInfo(clazz);

	}
}
