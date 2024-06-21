package customerTests;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import utility.Base;


public class nopComTest extends Base{
	
	@Test

	public void verifyLoginfeature() throws Exception {


		//launch app


//		Thread.sleep(5000);

		//email - id
 
		WebElement txtEmail = driver.findElement(By.id("Email"));

		txtEmail.clear();

		Thread.sleep(1000);

		txtEmail.sendKeys("admin@yourstore.com");

		//password - class

		driver.findElement(By.className("password")).clear();

		driver.findElement(By.className("password")).sendKeys("admin");


		//checkbox - name

		driver.findElement(By.name("RememberMe")).click();


		//login - button 

		driver.findElement(By.tagName("button")).click();


		Thread.sleep(3000);

		//validation steps

		String actualTitle = driver.getTitle();

		String expectedTitle = "Dashboard / nopCommerce administration";


		System.out.println("application title after login: " + actualTitle );


		//logout - linkText ------ exact text

		driver.findElement(By.linkText("Logout")).click();


		Thread.sleep(3000);

		System.out.println("application title after logout: " + driver.getTitle() );



	}
}
