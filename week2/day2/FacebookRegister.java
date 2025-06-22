package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegister {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver facebook = new ChromeDriver();
	facebook.navigate().to("https://en-gb.facebook.com/");
	facebook.manage().window().maximize();
	Thread.sleep(1000);
	facebook.findElement(By.linkText("Create new account")).click();
	facebook.findElement(By.name("firstname")).sendKeys("Chandru");
	facebook.findElement(By.name("lastname")).sendKeys("JCM");
	facebook.findElement(By.name("reg_email__")).sendKeys("8564795423");
	facebook.findElement(By.name("reg_passwd__")).sendKeys("Chan@123");
	//DOB Selection by Dropdown
	WebElement day = facebook.findElement(By.id("day"));
	Select dy = new Select(day);
	dy.selectByValue("14");
	
	WebElement month = facebook.findElement(By.id("month"));
	Select mnth = new Select(month);
	mnth.selectByValue("11");
	
	WebElement year = facebook.findElement(By.id("year"));
	Select yr = new Select(year);
	yr.selectByValue("2000");
	
	WebElement gender = facebook.findElement(By.name("sex"));
	Select sex = new Select(gender);
	sex.selectByValue("2");
	facebook.close();
	
	//facebook.findElement(By.linkText("Male")).click();
	
	
			}

}
