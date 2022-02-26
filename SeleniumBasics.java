package selenium.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {
	
	public static void main(String[] args) {
		
		System.out.println("automation Testing ");
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		
		 driver.manage().window().maximize();
		
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
	 	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		//Ctrl + 2 +L to print the web element 
		
		//  elementCrm it technical word is variable  
	
		WebElement elementCrm	= driver.findElement(By.linkText("CRM/SFA"));
		elementCrm.click();
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
	
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("P3 solutions");
		
		WebElement elementfirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementfirstName.sendKeys("Devika");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Kaladevi");
		
		//Assignment 
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DEV");
		
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		
		driver.findElement(By.name("description")).sendKeys("Testing group");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Devikask7@gmail.com");
		

		WebElement elementDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementDropdown);
		dd.selectByVisibleText("New York");
		WebElement elementCreateLeadButton = driver.findElement(By.name("submitButton"));
		elementCreateLeadButton.click();
		
		System.out.println("The Title of the Resulting page is:" +driver.getTitle());
		
		
		
		
		
		

	}

}
