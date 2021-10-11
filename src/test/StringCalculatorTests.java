package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.Throwable;

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
	void ShouldReturn3ForString1_2() {
		StringCalculator sc = new StringCalculator();
		
		assertEquals(3, sc.Add("1,2"));
	}
	
	@Test
	void ShouldReturnSumForStringWithTwoNumber() {
		StringCalculator sc = new StringCalculator();
		Random r = new Random();
		int num1 = r.nextInt(Integer.MAX_VALUE/20000001);
		int num2 = r.nextInt(Integer.MAX_VALUE/20000001);
		
		assertEquals(num1 + num2, sc.Add(num1 + "," + num2));
	}
	
	@Test
	void ShouldReturnSumForStringWithTwoNumberWithSpace() {
		StringCalculator sc = new StringCalculator();
		Random r = new Random();
		int num1 = r.nextInt(Integer.MAX_VALUE/20000001);
		int num2 = r.nextInt(Integer.MAX_VALUE/20000001);
		
		assertEquals(num1 + num2, sc.Add(num1 + "\n" + num2));
	}
	
	@Test
	void ShouldReturnSumForStringWithTwoNumberWithSemiColon() {
		StringCalculator sc = new StringCalculator();
		Random r = new Random();
		int num1 = r.nextInt(Integer.MAX_VALUE/20000001);
		int num2 = r.nextInt(Integer.MAX_VALUE/20000001);
		
		assertEquals(3, sc.Add("//;\n1;2"));
	}
	
	@Test
	void ShouldReturnSumIfNumbersLessThanThousand() {
		StringCalculator sc = new StringCalculator();
		
		assertEquals(2, sc.Add("2,1001"));
	}
	
	@Test
	void ShouldReturnSumWithBracketsInstring() {
		StringCalculator sc = new StringCalculator();
		
		assertEquals(6, sc.Add("//[***]\n1***2***3"));
	}
	
	@Test
	void ShouldReturnSumWithALotOfDelimiters() {
		StringCalculator sc = new StringCalculator();
		
		assertEquals(6, sc.Add("//[*][%]\n1*2%3"));
	}
	
	@Test
	void ShouldReturnSumWithMultipleDelimitersMoreThanOneChar() {
		StringCalculator sc = new StringCalculator();
		
		assertEquals(6, sc.Add("%//[*]]]]][[[%]\n\n\n//1*****2%3%%"));
	}
	
	@Test
	void ShouldReturnExceptionIfTwoNegativeNumber() {
		StringCalculator sc = new StringCalculator();
		String input = "-1,-2";
		assertEquals(0, sc.Add("-1,-2"));
	}

}
