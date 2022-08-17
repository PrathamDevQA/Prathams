package testPack;

import org.testng.annotations.Test;

public class DayFour {

	@Test
	public void mobileOne() {
		System.out.println("Mobile One");
	}
	@Test
	public void mobileTwo() {
		System.out.println("Mobile Two");
	}
	
	@Test
	public void mobileThree() {
		System.out.println("Mobile Three");
	}
	
	@Test(groups={"smoke"})
	public void mobileFour() {
		System.out.println("Mobile Four");
	}
	
	@Test
	public void tabOne() {
		System.out.println("Tab One");
	}
	
	@Test
	public void tabTwo() {
		System.out.println("Tab Two");
	}
	
}
