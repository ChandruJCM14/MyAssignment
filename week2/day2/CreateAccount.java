package week2.day2;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver create= new ChromeDriver();
		EdgeDriver create= new EdgeDriver();
		create.navigate().to("http://leaftaps.com/opentaps/control/main");
		create.manage().window().maximize();
		Thread.sleep(1000);
		create.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		Thread.sleep(1000);
		create.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		Thread.sleep(1000);
		create.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		create.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(1000);
		
		create.findElement(By.linkText("Accounts")).click();
		Thread.sleep(1000);
		create.findElement(By.linkText("Create Account")).click();
		Thread.sleep(1000);
		create.findElement(By.id("accountName")).sendKeys("Chandran1411");
		Thread.sleep(1000);
		create.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Thread.sleep(1000);
		
		WebElement industry = create.findElement(By.name("industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByValue("IND_HARDWARE");
		Thread.sleep(1000);
		
		WebElement owner = create.findElement(By.name("ownershipEnumId"));
		Select own = new Select(owner);
		own.selectByVisibleText("S-Corporation");
		Thread.sleep(1000);
		
		WebElement source = create.findElement(By.name("dataSourceId"));
		Select src = new Select(source);
		src.selectByValue("LEAD_EMPLOYEE");
		Thread.sleep(1000);
		
		WebElement marketing = create.findElement(By.name("marketingCampaignId"));
		Select marcamp = new Select(marketing);
		marcamp.selectByIndex(6);
		Thread.sleep(1000);
		
		WebElement state = create.findElement(By.name("generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByValue("TX");
		Thread.sleep(1000);
		
		create.findElement(By.className("smallSubmit")).click();
		
		String title = create.getTitle();
		if (title.contains("Account Details | opentaps CRM")) {
					System.out.println("Title is verified");	
		}
			 else {
				 System.out.println("Title is not Verified");
			} 	
			//create.close();
		}
		
	}
	
