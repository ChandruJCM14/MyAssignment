package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver lead= new ChromeDriver();
		EdgeDriver lead= new EdgeDriver();
		lead.navigate().to("http://leaftaps.com/opentaps/control/main");
		lead.manage().window().maximize();
		Thread.sleep(1000);
		lead.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		Thread.sleep(1000);
		lead.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		Thread.sleep(1000);
		lead.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		lead.findElement(By.linkText("CRM/SFA")).click();
		
		lead.findElement(By.linkText("Accounts")).click();
		Thread.sleep(1000);
		lead.findElement(By.linkText("Create Account")).click();
		Thread.sleep(1000);
		lead.findElement(By.id("accountName")).sendKeys("Chandru9214");
		Thread.sleep(1000);
		lead.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Thread.sleep(1000);
		lead.findElement(By.name("numberEmployees")).sendKeys("230");
		Thread.sleep(1000);
		lead.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		Thread.sleep(1000);
		lead.findElement(By.className("smallSubmit")).click();
		
		String title = lead.getTitle();
		if (title.contains("Account Details | opentaps CRM")) {
			System.out.println("Webpage Verified");
		} else {
			System.out.println("Webpage not Verified");
		}
		

	}

}
