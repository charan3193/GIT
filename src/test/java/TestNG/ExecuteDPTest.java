package TestNG;

import org.testng.annotations.Test;

public class ExecuteDPTest {
@Test(dataProviderClass= DataProviderTest.class,dataProvider="Travel")

public void getData(String src, String  dst, int price)
{
	System.out.println("From---> "+src+"  To---> "+dst+"--->"+price);
}
}
