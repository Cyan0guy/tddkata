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
		assertEquals(27, a.Add("1,3,5,7,11"));
		assertEquals(6, a.Add("1\n2,3"));
		assertEquals(3 ,a.Add("//;\n1;2"));
		//assertEquals("negatives not allowed", a.Add("-1,-2,-4"));
		assertEquals(2, a.Add("1001,2"));
		assertEquals(6, a.Add("//[***]\n1***2***3"));
		assertEquals(6, a.Add("//[*][%]\n1*2%3"));
	}

}
