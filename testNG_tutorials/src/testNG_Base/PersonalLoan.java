package testNG_Base;

import org.testng.annotations.Test;

public class PersonalLoan {
    
	@Test
	public void Below5lLoan() {
		System.out.println("Personal Loan Percentage below 5 Lakh 15%");
	}
    
	@Test
	public void Above5lLoan() {
		System.out.println("Personal Loan Percentage above 5 Lakh 10%");
	}

}
