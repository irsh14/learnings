package testNG_Base;

import org.testng.annotations.Test;

public class HomeLoan {

	@Test
	public void Below5lLoan_home() {
		System.out.println("Home Loan Percentage below 5 Lakh 12%");
	}

	@Test
	public void Above5lLoan_home() {
		System.out.println("Home Loan Percentage above 5 Lakh 10%");
	}

}
