package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day4 {
	 @AfterTest
		public void webbrowserquit() {
			System.out.println("close all tab at last for banking app");
		}
	 @AfterSuite
		public void endmessage() {
			System.out.println("All test ran successfully");
		}
	 @AfterClass
		public void afterclass() {
			
			System.out.println("after class is executed");
		}
	
	  @BeforeClass
	  public void Afterclass() {
			System.out.println("Befor class is executed");
	  }
    @Test(groups= {"smoke"})
	public void homeloanWebapp() {
		System.out.println("homeloan login webpage");
	}
    @Test
	public void homeloanmobileapp() {
		System.out.println("homeloan login mobile page");
	}
    @Test
	public void homeloanrestapi() {
		System.out.println("homeloan login restapi");
	}
}
