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
		//Assert.assertTrue(false);
	}
	@AfterSuite	
	public void AfterSuite()
	{
		System.out.println("THis is AfterSuite method of Day 1");
	}

	@Test
	public void SecondTest()
	{
		System.out.println("Day 1 SecondTest");
	}
}
