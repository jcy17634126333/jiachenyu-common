package com.jcy.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {

	@Test
	void testHasLength() {
		boolean b = StringUtil.hasLength(" ");
		System.out.println(b);
	}

	@Test
	void testHasText() {
		boolean b = StringUtil.hasText("sda");
		System.out.println(b);
	}

	@Test
	void testRandomChineseString() {
		String string = StringUtil.randomChineseString(10);
		System.out.println(string);
	}

	@Test
	void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
