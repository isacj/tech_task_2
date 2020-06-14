package jenkinstest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jenkinstest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaffi\\Desktop\\Softwares\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.1.7:8080/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("j_username")).sendKeys("isacj");
		Thread.sleep(1000);
		driver.findElement(By.name("j_password")).sendKeys("$piderman2");
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		String at = "http://192.168.1.7:8080/";
		String et = driver.getCurrentUrl();
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	
	}

}