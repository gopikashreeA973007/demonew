package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdef2 {
	WebDriver driver;
	@Given("user opens the chrome browser")
	public void user_opens_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
	}

	@When("user navigates to testme app")
	public void user_navigates_to_testme_app() {
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	   driver.findElement(By.id("userName")).sendKeys("lalitha");
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@When("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		driver.findElement(By.name("Login")).click();
	}


}
