package stepdefinitions;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
//	WebDriver driver;
//	
//	@Given("^User is already on Login Page$")
//	public void User_is_already_on_Login_Page () {
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get("https://www.freecrm.com");	
//		driver.manage().window().maximize();
//	}
//
//
//	@SuppressWarnings("deprecation")
//	@When ("^Title of Login Page is Free CRM$")
//	public void Title_of_Login_Page_is_Free_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Free CRM software for customer relationship management, sales, marketing campaigns and support.", title);
//	} 
//	
//	@Then("^User enters username and password$")
//	public void user_enters_username_and_password(){
//		driver.findElement(By.xpath("//a[text() ='Login']")).click();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sokoeurn.chhaya@gmail.com");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("#Kem1988#");
//		
//	}
//	
//	@Then("^User clicks on Login Button$")
//	public void user_clicks_on_Login_Button() {
//		driver.findElement(By.xpath("//div[text() = 'Login']")).click();
//	}
//	
//	
//	@SuppressWarnings("deprecation")
//	@Then("^User is on Home Page$")
//	public void user_is_on_Home_Page(){
//		String title = driver.getTitle();
//		Assert.assertEquals("Cogmento CRM", title);
//	}




}
