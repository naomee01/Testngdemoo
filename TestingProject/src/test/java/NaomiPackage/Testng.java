package NaomiPackage;

import org.testng.annotations.Test;

public class Testng {
	@Test
	public void login() {

		System.out.println("Login to application....");
	}

	@Test(priority = 3)
	public void logout() {

		System.out.println("logout from application....");
	}

	@Test(priority = -1)
	public void openapp() {

		System.out.println("opening application....");
	}
}
