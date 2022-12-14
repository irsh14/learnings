package testNG_Base;

import org.testng.annotations.Test;

public class CarLoan2 {
    
	@Test
	public void Near10lLoan() {
		System.out.println("Car Loan Percentage below 10 Lakh 8%");
	}
    
	@Test
	public void Above15lLoan() {
		System.out.println("CAR Loan Percentage above 15 Lakh 5%");
	}

}
