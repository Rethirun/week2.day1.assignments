package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();//Verify the version,download and set the chrome driver
		
		ChromeDriver driver=new ChromeDriver();//Launch the chrome browser
		
		driver.get("http://leaftaps.com/opentaps/control/login");//load the URL
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();//maximize the browser
		
		//2. Enter Username and Password Using id locator
		//id->username,password
		//Demosalesmanager
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//3. Click on Login button using Class Locator
		//classname->decorativeSubmit
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4. Click on CRM/SFA Link
		//linktext->CRM/SFA
		
		driver.findElement(By.linkText("CRM/SFA")).click();

		//5. Click on Leads Button
		//linktext->Leads
		
		driver.findElement(By.linkText("Leads")).click();

		//6. Click on Create Lead
		//linktext->Create Lead
		
		driver.findElement(By.linkText("Create Lead")).click();

		//7. Enter CompanyName Field using id Locator
		//id->createLeadForm_companyName
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//8. Enter FirstName field using id locator
		//id->createLeadForm_firstName
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathi");

		//9. Enter LastName Field using id Locator
		//id->createLeadForm_lastName
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiru");

		//10.Enter FirstName (Local) field using id locator
		//id->createLeadForm_firstNameLocal
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Reva");

		//11. Enter Department Field using any Locator of your choice
		//id->createLeadForm_departmentName
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		//12. Enter Description Field using any Locator of your choice
		//id->createLeadForm_description
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation");

		//13. Enter your email in the E-mail address field using locator of your choice
		//id->createLeadForm_primaryEmail
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathi.cse2011@gmail.com");

		//14. Select the State/Province as NewYork using Visible Text
		//id->createLeadForm_generalStateProvinceGeoId
		
		WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(stateDropdown);
		select.selectByVisibleText("Armed Forces Americas");

		//15. Click on Create button
		//class->smallSubmit
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//16. Get the Title of Resulting Page using driver.getTitle() 
		String title = driver.getTitle();
		
		System.out.println(title);

		

	}

}
