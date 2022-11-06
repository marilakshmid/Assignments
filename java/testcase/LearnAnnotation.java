package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnAnnotation {

	@BeforeMethod
	public void method1() {
		System.out.println("method1");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
}
