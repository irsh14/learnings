package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
   @Test(dependsOnMethods = {"test2","test3"})
	public void test1() {
		
		System.out.println("I am TestNG");
	}
   @Parameters({"URL"})
   @Test(groups= {"smoke"})
   public void test2(String testngurl) {
	   System.out.println("Welcome to TestNg");
	   System.out.println(testngurl);
   }
   
   @Test
   public void test3() {
	   System.out.println("you have now  access to TestNg ");
   }
   @Test(enabled = false)
   public void test4() {
	   System.out.println("there is a bug , skip the test4 ");
   }
}
