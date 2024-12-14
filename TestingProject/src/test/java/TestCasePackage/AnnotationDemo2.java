package TestCasePackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
1.Login
2.Search
4.Advanced Search
5.Logout
*/



public class AnnotationDemo2 {

@BeforeClass
void Login()	
{
	System.out.println("This is login..");
}
	@Test(priority=1)
	void Search()
	{
		System.out.println("This is Search..");
	}
	
	@Test (priority=2)
	void AdvancedSearch()
	{
		System.out.println("This is Adv Search..");
	}
	@AfterClass
	void Logout()
	{
		System.out.println("This is Logout..");
	}
	
	
	
	
}




