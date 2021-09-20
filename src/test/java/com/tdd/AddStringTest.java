package com.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddStringTest {

	@Test
	void test() {
		AddString a=new AddString();
		assertEquals(0, a.Add(""));
		assertEquals(1, a.Add("1"));
		assertEquals(3, a.Add("1,2"));
	}

}
