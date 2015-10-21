package com.dynamo.domain.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.dynamo.domain.Person;

public class ClassComparatorTest {
	@Test
	public void test1() {

		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 7; i++) {
			Person p = new Person(i + "", i);
			list.add(p);
		}

		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});
	}
}
