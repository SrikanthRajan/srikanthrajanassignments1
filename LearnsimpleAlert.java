package Week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnsimpleAlert {
	
	public static void main(String[] args) throws InterruptedException {
	
	
	ChromeDriver  driver = new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	
	Alert simpalert = driver.switchTo().alert();
	
	String text= simpalert.getText();
	System.out.println(text);
	Thread.sleep(5000);
	simpalert.accept();
	
	

	
		// TODO Auto-generated method stub

	}

}
