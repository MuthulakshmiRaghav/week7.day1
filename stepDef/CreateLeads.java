package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeads extends ProjectSpecificMethods {

	@Given("Click CRMSFA Link")
	public void clickCrmsfaLink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click leads button")
	public void clickLeadsLink()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click create lead link")
	public void clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter companyName as (.*)$")
	public void enterCompanyName(String companyName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	@And("Enter firstName as (.*)$")
	public void enterFirstName(String firstName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@And("Enter lastName as (.*)$")
	public void enterLastName(String lastName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	@And("Enter department as (.*)$")
	public void enterDept(String dept)
	{
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dept);
	}
	@And("Enter email as (.*)$")
	public void enterEmail(String email)
	{
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}
	@And("Click create button")
	public void clickCreateButton()
	{
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("Verify the View Leads Page")
	public void verifyViewPage()
	{
		driver.findElement(By.id("sectionHeaderTitle_leads")).isDisplayed();
		String title = driver.getTitle();
		System.out.println(title);	
	}
}
