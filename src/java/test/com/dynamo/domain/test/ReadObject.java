/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: ReadObject.java
 * Author:   Administrator
 * Date:     2015年9月18日 上午9:13:19
 * Description: 
 */
package com.dynamo.domain.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.dynamo.domain.Lion;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ReadObject {
	public static void main(String args[]) {

		Lion lion;

		try {

			FileInputStream fin = new FileInputStream("c:\\address.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			lion = (Lion) ois.readObject();
			ois.close();

			System.out.println(lion);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
