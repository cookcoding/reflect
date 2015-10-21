package com.dynamo.domain.test;

import org.junit.Test;

import com.dynamo.domain.Female;
import com.dynamo.domain.Human;
import com.dynamo.domain.Man;

public class MulitStatusTest {
	
	@Test
	public void test(){
		Human human = new Human();
		human.toilet();
		
		Human man = new Man();
		man.toilet();
		
		Human Female = new Female();
		Female.toilet();
	}
}
