package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Find your account and log in.")).click();
		
		String titlename = driver.getTitle();
		System.out.println("Page Status"+titlename);
		if (titlename.contains("Forgotten Password | Can't Log In | Facebook")) {
			System.out.println("Page is verified");
		} else {
			System.out.println("Page is not verified");
		}
		
	}

}
