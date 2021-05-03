package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last - lastexecution of Day 1");		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		System.out.println("hello1");//automation
		System.out.println("hello2");//automation
		//Assert.assertTrue(false);
	}
	@AfterSuite	
	public void AfterSuite()
	{
		System.out.println("THis is AfterSuite method of Day 1");
		System.out.println("THis is AfterSuite method of Day 2");
	}

	@Test
	public void SecondTest()
	{
		System.out.println("Day 1 SecondTest");
		System.out.println("Day 1 SecondTest");
	}
}
