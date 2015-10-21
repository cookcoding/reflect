/*
 * Copyright (C), 2014-2015, 杭州小卡科技有限公司
 * FileName: WriteObject.java
 * Author:   Administrator
 * Date:     2015年9月18日 上午9:11:42
 * Description: 
 */
package com.dynamo.domain.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.dynamo.domain.Address;

/**
 * 〈一句话是什么〉<br>
 * 〈详细描述做什么〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class WriteObject {
	public static void main(String args[]) {

		Address address = new Address();
		address.setName("loin");
		//address.setCountry("united states");

		try {

			FileOutputStream fout = new FileOutputStream("c:\\address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
