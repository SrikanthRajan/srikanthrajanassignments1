package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the Leads link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on the CreateLead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Srikanth");
		
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajan");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Rajan");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("PHYSICS");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium Web Driver Learning");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("srikanthguruprakash@gmail.com");
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options1=new Select(stateProvince);
		options1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		////tagName[text()='text value in DOM'] 
		driver.findElement(By.xpath(" //a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("important note being updated");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[2]")).click();
		
		System.out.println(driver.getTitle());
		driver.close();

	}

	
	
	
	}
	


