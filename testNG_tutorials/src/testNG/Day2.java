package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day2 {
	
	  @AfterTest
			public void aftertest() {
				
				System.out.println("close all after test tabs");
			}
	  @AfterClass
		public void afterclass() {
			
			System.out.println("after class is executed");
		}
	
	  @BeforeClass
	  public void Afterclass() {
			System.out.println("Before class is executed");
	  }
	  @Parameters({"URL"})
	  @Test
		public void test1(String login) {
			
			System.out.println("You are now learning TestNG Frame Work");
			System.out.println(login);
		}
	   @Test(groups= {"smoke"})
	   public void test2() {
		   System.out.println("you are now learning  XML format of TestNG");
	   }
	   @BeforeTest
	   public void beforetest() {
		   System.out.println("open Webbdriver for TestNG");
	   }

}
