package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", 
				"/home/muthu/Documents/Selenium/geckodriver");
			
		WebDriver driver = new FirefoxDriver();

        //goto url

        driver.get("http://mozilla.org");

        //Call TakeScreenshot function

      //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

         File srcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

     File destFile=new 
   File("/home/muthu/eclipse-workspace/Selenium Project/src/selenium/learnings/abc.png");

                //Copy file at destination
                

                FileHandler.copy(srcFile, destFile);  

	}

}
