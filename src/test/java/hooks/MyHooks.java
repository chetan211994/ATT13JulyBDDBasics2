package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	
	
	@Before
	public void beforeHook1()
	{
		System.out.println("Before hook1 is executing");
	}
	
//	@After(order = 100)
//	public void afterHook1() {
//		System.out.println("After hook1 is executing");
//	}
//	
//	@Before(order = -2)
//	public void beforeHook2()
//	{
//		System.out.println("Before hook2 is executing");
//	}
	
	@After
	public void afterHook2() {
		System.out.println("After hook2 is executing");
	}
	
	@BeforeStep(order = 1)
	public void beforeStep1()
	{
		System.out.println("Before step1 is executing");
	}
	@BeforeStep(order = 2)
	public void beforeStep2()
	{
		System.out.println("Before step2 is executing");
	}

	@AfterStep
	public void afterStep()
	{
		System.out.println("After step is executing");
	}
	
	@BeforeAll(order = 1)
	public static void beforeAll1()
	{
		System.out.println("Before all1 is executing");
	}
	
	@BeforeAll(order = 2)
	public static void beforeAll2()
	{
		System.out.println("Before all2 is executing");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("After all is executing");
	}
	
}
