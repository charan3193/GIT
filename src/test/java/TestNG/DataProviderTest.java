package TestNG;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

	
	@DataProvider(name="data")
	public Object[][] storeData()
	{
		Object[][]   obj= new  Object[2][2] ;
	
		obj[0][0]="TY";
		obj[0][1]="Xspider";
		
		obj[1][0]="Qspider";
		obj[1][1]="jspider";
		
		
		
return obj;
		
	}
	@DataProvider()
	public Object[][] Travel()
	{
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="Mysore";
		obj[0][1]="Bangaloe";
		obj[0][2]=100;
		
		obj[1][0]="Bangalore";
		obj[1][1]="pune";
		obj[1][2]=500;
			return obj;
	}		
	}
