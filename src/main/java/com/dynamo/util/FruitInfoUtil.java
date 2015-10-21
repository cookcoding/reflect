/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: FruitInfoUtil.java
 * Author:   Administrator
 * Date:     2015年9月18日 上午11:53:24
 * Description: 
 */
package com.dynamo.util;

import java.lang.reflect.Field;

import com.dynamo.annotation.FruitColor;
import com.dynamo.annotation.FruitName;
import com.dynamo.annotation.FruitProvider;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class FruitInfoUtil {
	public static void getFruitInfo(Class<?> clazz) {
//
//		StringBuffer strFruitName = new StringBuffer("水果名称：");
//		StringBuffer strFruitColor = new StringBuffer("水果颜色: ");
//		StringBuffer strFruitProvicer = new StringBuffer("供应商信息: ");
//		
//		Field[] fields = clazz.getDeclaredFields();
//		
//		for (Field field : fields) {
//			if(field.isAnnotationPresent(FruitName.class)){
//				FruitName fruitName = (FruitName)field.getAnnotation(FruitName.class);
//				strFruitName.append(fruitName.value());
//				System.out.println(strFruitName.toString());
//			}
//			if(field.isAnnotationPresent(FruitColor.class)){
//				FruitColor fruitColor = (FruitColor)field.getAnnotation(FruitColor.class);
//				strFruitColor.append(fruitColor.fruitColor().toString());
//				System.out.println(strFruitColor.toString());
//			}
//			if(field.isAnnotationPresent(FruitProvider.class)){
//				FruitProvider fruitProvider = (FruitProvider)field.getAnnotation(FruitProvider.class);
//				strFruitProvicer.append(fruitProvider.id()).append(fruitProvider.name()).append(fruitProvider.address());
//				System.out.println(strFruitProvicer.toString());
//			}
//		}
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field field : fields) {
			if(field.isAnnotationPresent(FruitName.class)){
				FruitName fruitName = (FruitName)field.getAnnotation(FruitName.class);
				System.out.println("fruitName: "+fruitName.value());
			}
		}
	}
}
