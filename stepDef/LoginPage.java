package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {

	@Given("Enter the Username as {string}")
	public void enterUsername(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@And("Enter the Password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click the Login Button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the Home Page is displayed")
	public void verifyHomePage() {
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		String attr = logout.getAttribute("value");
		if (attr.equals("Logout"))
			System.out.println("Successfully logged in");
	}

	@But("Error message is displayed")
	public void checkErrorMessage() {
		String errorMessage = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(errorMessage);
	}
}
