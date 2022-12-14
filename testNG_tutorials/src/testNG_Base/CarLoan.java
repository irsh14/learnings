package testNG_Base;

import org.testng.annotations.Test;

public class CarLoan {
    
	@Test
	public void Below5lLoan() {
		System.out.println("Car Loan Percentage below 5 Lakh 12%");
	}
    
	@Test
	public void Above5lLoan() {
		System.out.println("CAR Loan Percentage above 5 Lakh 10%");
	}

}
