package Week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LearningFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(2);
		
	WebElement findElement = driver.findElement(By.xpath("//iframe[@name='frame2']"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
	    System.out.println("from inner fraame : " +driver.findElement(By.xpath("//button[@id='Click']")).getText());
	    
		
		
	}

}
