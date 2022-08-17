package testPack;

import org.testng.annotations.Test;

public class DayThree {
	
	@Test
	public void carLoan() {
		System.out.println("Car Loan");
	}
	
	@Test(groups={"smoke"})
	public void homeLoan() {
		System.out.println("Home Loan");
	}
}
