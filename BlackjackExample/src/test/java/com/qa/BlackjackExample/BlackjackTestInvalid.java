package com.qa.BlackjackExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackjackTestInvalid {
	Blackjack b = new Blackjack();
	static int x=1; //static variable is ignored after the first time the program runs
	@BeforeClass
	public static void start() {
		System.out.println("Welcome to my Invalid Entries Tests");x=1;// resets the counter
	}
	@Before
	public void setup() {
		System.out.println("Test "+x+"/12 start");
	}
	@After
	public void teardown() {
		System.out.println("Test "+x+"/12 completed");x++;
	}
	@AfterClass
	public static void end() {
		System.out.println("Test class completed");
		;
	}
	@Test
	public void Test1() {
	
		assertEquals("2 low invalid entries", 0, b.play(-10, -10));
	}

	@Test
	public void Test2() {
		assertEquals("1 low invalid entry, 1 compare entry", 0, b.play(-10, 10));
	}

	@Test
	public void Test3() {
		assertEquals("1 low invalid entry, 1 bust entry", 0, b.play(-10, 30));
	}

	@Test
	public void Test4() {
		assertEquals("1 low invalid entry, 1 high invalid entry", 0, b.play(-10, 50));
	}

	@Test
	public void Test5() {

		assertEquals("1 compare entry, 1 low invalid entry", 0, b.play(10, -10));
	}


	@Test
	public void Test6() {
		assertEquals("1 compare entry, 1 high invalid entry", 0, b.play(10, 50));
	}

	@Test
	public void Test7() {

		assertEquals("1 bust entry and 1 low invalid entry", 0, b.play(30, -10));
	}

	@Test
	public void Test8() {
		assertEquals("2 high invalid entries", 0, b.play(30, 50));
	}

	@Test
	public void Test9() {

		assertEquals("1 high invalid entry and 1 low invalid entry", 0, b.play(50, -10));
	}

	@Test
	public void Test10() {
		assertEquals("1 high invalid entry and 1 compare entry", 0, b.play(50, 10));
	}

	@Test
	public void Test11() {
		assertEquals("1 high invalid entry and 1 bust entry", 0, b.play(50, 30));
	}

	@Test
	public void Test12() {
		assertEquals("2 high invalid entries", 0, b.play(50, 50));
	}
}