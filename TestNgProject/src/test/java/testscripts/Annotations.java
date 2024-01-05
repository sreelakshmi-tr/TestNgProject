package testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Annotations extends Base{
	
	@Test
	public void annotation_test() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void annotation_test2() {
		System.out.println("Test case 2");
	}

	@BeforeMethod 
	public void annotation_beforeMethod() {
		System.out.println("@Before method");
	}
	
	@AfterMethod 
	public void annotation_afterMethod() {
		System.out.println("@After method");
	}
	
	@BeforeClass 
	public void annotation_beforeClass() {
		System.out.println("@Before class");
	}
	
	@AfterClass
	public void annotation_afterClass() {
		System.out.println("@After class");
	}
	@BeforeTest 
	public void annotation_beforeTest() {
		System.out.println("@Before Test");
	}
	
	@AfterTest
	public void annotation_afterTest() {
		System.out.println("@After Test");
	}
	@BeforeSuite 
	public void annotation_beforeSuite() {
		System.out.println("@Before Suite");
	}
	
	@AfterSuite
	public void annotation_afterSuite() {
		System.out.println("@After Suite");
	}
	
}
