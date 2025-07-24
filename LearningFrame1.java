package Week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class LearningFrame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver  = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");




WebElement findElement = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
driver.switchTo().frame(findElement);
driver.findElement(By.xpath("//button[text()='Try it']")).click();

Alert simpalert = driver.switchTo().alert();

simpalert.sendKeys("SRIKANTH");
simpalert.accept();

driver.close();



	}

}
