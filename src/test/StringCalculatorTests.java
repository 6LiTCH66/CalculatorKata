package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.StringCalculator;

class StringCalculatorTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ShouldReturn0ForEmptyString() {
		StringCalculator sc = new StringCalculator();
		
		assertEquals(0, sc.Add(""));
	}
	
	@Test
	void ShouldReturn1ForString1() {
		StringCalculator sc = new StringCalculator();
		
		assertEquals(1, sc.Add("1"));
	}
	
	@Test
	void ShouldRetur3ForString1_2() {
		StringCalculator sc = new StringCalculator();
		
		assertEquals(3, sc.Add("1,2"));
	}

}
