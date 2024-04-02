package TestNG;

import org.testng.annotations.Test;


public class Script1 {

	
@Test(priority=1)

public void createTest()
{
	System.out.println("-----create test----");
}
@Test(priority=2)
public void editTest()
{
	System.out.println("----edit test-----");
}
@Test(priority=-1)
public void deleteTest()
{
	System.out.println("----delete Test----");
}
}
