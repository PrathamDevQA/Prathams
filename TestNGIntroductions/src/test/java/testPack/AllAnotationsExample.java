package testPack;

import org.testng.annotations.*;


public class AllAnotationsExample {
	
	@BeforeClass
	public void a() {
		System.out.println("One");
	}
	@BeforeMethod
	public void b() {
		System.out.println("Two");
	}
	@BeforeTest
	public void c() {
		System.out.println("Three");
	}
	@Test
	public void d() {
		System.out.println("Four");
	}
	@Test
	public void h() {
		System.out.println("Eight");
	}
	@AfterTest
	public void e() {
		System.out.println("Five");
	}
	@AfterMethod
	public void f() {
		System.out.println("Six");
	}
	@AfterClass
	public void g() {
		System.out.println("Seven");
	}
	

}
