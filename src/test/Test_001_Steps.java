package TestClass.TestStep;

import com.maven.test.commonutils;

import cucumber.annotation.en.Given;

public class TC_001_Steps extends commonutils {

		          
		@Given("^a user trying to login with his \"([^\"]*)\" and \"([^\"]*)\"$") 
		public void usernavigate(String username, String password) 
		{
			System.out.println(username);
		}
		
		@Then("^the user should be logged in successfully.$")
		public void usernaviga() 
		{
			System.out.println("username");
		}


}
