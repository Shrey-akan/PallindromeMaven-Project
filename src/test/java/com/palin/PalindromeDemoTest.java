package com.palin;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PalindromeDemoTest {
	@Before
	public void beforeAll() {
		System.out.println("Life Cycle demo : before nethod");	
		}
	@Test
	public void test() {
		PalindromeDemo ff = new PalindromeDemo();
		assertEquals(121,ff.show(121));
	}
	@Test
	public void test1() {
		PalindromeDemo ff = new PalindromeDemo();
		assertEquals(131,ff.show(131));
	}
	@After
	public void afterAll() {
		System.out.println("Life Cycle demo : After nethod");	
		}
	
}
