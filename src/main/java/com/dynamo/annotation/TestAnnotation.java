/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: TestAnnotation.java
 * Author:   Administrator
 * Date:     2015年9月10日 下午8:28:53
 * Description: 
 */
package com.dynamo.annotation;

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
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {

    int count() default 1;

}
