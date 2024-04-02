package TestNG;

import org.testng.annotations.Test;

public class Script2 {

	@Test(dependsOnMethods="deleteTest")

	public void createTest()
	{
		System.out.println("-----create test----");
	}
	@Test(priority=2, invocationCount=2)
	public void editTest()
	{
		System.out.println("----edit test-----");
	}
	@Test
	public void deleteTest()
	{
		int[]a = {1,2,4,5};
	    System.out.println(a[5]);
		System.out.println("---delete test----");
}
}