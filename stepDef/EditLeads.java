package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class EditLeads extends ProjectSpecificMethods {

	@Given("Click Crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@And("Click Leads button link")
	public void clickLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@And("Click Find leads")
	public void clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Enter first name as (.*)$")
	public void enterFirstName(String firstName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
	}

	@And("Click Find leads button")
	public void clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("Click on first resulting lead")
	public void clickFirstRecord() {
		driver.findElement(By.linkText("Muthu")).click();
	}

	@And("Click Edit")
	public void clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@And("Change the companyName as (.*)$")
	public void changeCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	}

	@And("Click Update")
	public void clickUpdateButton() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}

	@Then("Verify the changed name appears")
	public void verifyUpdatedName() {
		String newCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(newCompany);
		if (newCompany.contains("Infosys"))
			System.out.println("New company name is updated");
		else
			System.out.println("New company name is not updated");
	}

}
