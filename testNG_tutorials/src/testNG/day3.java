package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	 @BeforeTest
		public void weebbrowserlogin() {
			System.out.println("driver will execute first");
		}
	 @BeforeSuite
		public void starttest() {
			System.out.println("you have started Test Successfully");
		}
	 @BeforeMethod
		public void bmethod() {
			System.out.println("restart  tab before every method");
	 }
	 @AfterMethod
		public void Amethod() {
			System.out.println("Close mini tab after every method");
	 }
	 @Parameters({"URL"})
    @Test(groups= {"smoke"})
	public void carloanWebapp(String loanurl) {
		System.out.println("carloan login Webpage");
		System.out.println(loanurl);
	}
    @Test
	public void carloanmobileapp() {
		System.out.println("carloan login mobile");
	}
    @Test
	public void carloanrestapi() {
		System.out.println("carloan login Api");
	}
    @Test
 	public void carloanmobileappm1() {
 		System.out.println("carloan module1 test");
    }
    @Test
   	public void carloanmobileappm2() {
   		System.out.println("carloan module2 test");
      }
    
}
