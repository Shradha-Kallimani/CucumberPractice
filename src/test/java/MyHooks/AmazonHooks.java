//package MyHooks;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.Scenario;
//
//public class AmazonHooks {
//
//	@Before("@Smoke")
//	public void setup_browser(Scenario sc)
//	{
//		System.out.println("Launch Chrome browser");
//		System.out.println(sc.getName());
//	}
//	
//	@Before(order = 2)
//	public void setup_url()
//	{
//		System.out.println("Launch url");
//	}
//	
//	@After(order=2)
//	public void teardown_Close()
//	{
//		System.out.println("Close the browser");
//	}
//	
//	@After(order=1)
//	public void teardown_Logout()
//	{
//		System.out.println("logout from the app");
//	}
//	
//	@BeforeStep
//	public void takescreenshot()
//	{
//		System.out.println("take a screenshot");
//	}
//	
//	@AfterStep
//	public void refreshPage()
//	{
//		System.out.println(" Refresh the page");
//	}
//}
