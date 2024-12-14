package TestCasePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
1.Login
2.Search
3.Logout
4.Login
5.Advanced Search
6.Logout */



public class AnnotationDemo {

	@BeforeMethod
void Login()	
{
	System.out.println("This is login..");
}
	@Test(priority=1)
	void Search()
	{
		System.out.println("This is Search..");
	}
	
	
	@AfterMethod
	void Logout()
	{
		System.out.println("This is Logout..");
	}
	
	@Test (priority=2)
	void AdvancedSearch()
	{
		System.out.println("This is Adv Search..");
	}
	
	
}
