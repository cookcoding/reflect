/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: CopyPropertiesTest.java
 * Author:   Administrator
 * Date:     2015年10月21日 下午2:22:58
 * Description: 
 */
package com.dynamo.domain.test;

import org.junit.Test;

import com.dynamo.domain.Lion;
import com.dynamo.domain.Tiger;
import com.dynamo.util.MyBeanUtils;

/**
 * 〈一句话是什么〉<br> 
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CopyPropertiesTest {
	@Test
	public void test(){
		Lion lion = new Lion();
		lion.setAge(1);
		lion.setBeLook("belook");
		lion.setName("dynamo");
		Tiger tiger = new Tiger();
		
		MyBeanUtils.copyProperties(lion, tiger);
		System.out.println(tiger);
	}
}
