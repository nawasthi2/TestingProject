package com.maven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class commonutils 
{
	 static WebDriver driver ;
	 
    
	 public WebDriver driverfunction(String driverName )
    {
    	
        if(driverName.equals("Firefox"))
        {
          driver = new FirefoxDriver();
        }
        else if(driverName.equalsIgnoreCase("IE"))
        {
        	System.out.println("No IE configered");
        }
       return driver;
    }


	
}
