/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: FruitColor.java
 * Author:   Administrator
 * Date:     2015年9月18日 上午11:49:34
 * Description: 
 */
package com.dynamo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	/**
	 * 颜色枚举
	 * 
	 * @author peida
	 *
	 */
	public enum Color {
		BULE, RED, GREEN
	};

	/**
	 * 颜色属性
	 * 
	 * @return
	 */
	Color fruitColor() default Color.GREEN;
}
