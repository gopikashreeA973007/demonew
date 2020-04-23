package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef1 {
	WebDriver driver;
	
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    
	}

	@When("user navigates to registration page")
	public void user_navigates_to_registration_page() {
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enters with username as {string}")
	public void user_enters_with_username_as(String string) {
	    driver.findElement(By.id("userName")).sendKeys("tomboy");
	}

	@When("user enters with firstname as {string}")
	public void user_enters_with_firstname_as(String string) {
		driver.findElement(By.id("firstName")).sendKeys("rthi");
	}

	@When("user enters with lastname as {string}")
	public void user_enters_with_lastname_as(String string) {
		driver.findElement(By.id("lastName")).sendKeys("shree");
	}

	@When("user enters with password as {string}")
	public void user_enters_with_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@When("user enters with confirmpassword as {string}")
	public void user_enters_with_confirmpassword_as(String string) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("Password123");
	}

	@When("user enters with gender as {string}")
	public void user_enters_with_gender_as(String string) {
		driver.findElement(By.id("gender")).click();
	}

	@When("user enters with email as {string}")
	public void user_enters_with_email_as(String string) {
		driver.findElement(By.id("emailAddress")).sendKeys("gopi@gmail.com");
	}

	@When("user enters with mobilenumber as {string}")
	public void user_enters_with_mobilenumber_as(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys("7904425651");
	}

	@When("user enters with dob as {string}")
	public void user_enters_with_dob_as(String string) {
		driver.findElement(By.id("dob")).sendKeys("30/02/1996");
	}

	@When("user enters with address as {string}")
	public void user_enters_with_address_as(String string) {
		driver.findElement(By.id("address")).sendKeys("perungalathur");
	}

	@When("user enters with Security as {string}")
	public void user_enters_with_Security_as(String string) {
		driver.findElement(By.name("securityQuestion")).sendKeys("what is your nickname");
	}

	@When("user enters with answer as {string}")
	public void user_enters_with_answer_as(String string) {
		driver.findElement(By.id("answer")).sendKeys("rthi");
	}

	@Then("verify registration success")
	public void verify_registration_success() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	    
	}



}
