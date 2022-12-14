package testNG_Base;

import org.testng.annotations.Test;

public class HomeLoan2 {

	@Test
	public void Below15lLoan_home() {
		System.out.println("Home Loan Percentage below 15 Lakh 9%");
	}

	@Test
	public void Above15lLoan_home() {
		System.out.println("Home Loan Percentage above 15 Lakh 7%");
	}

}
