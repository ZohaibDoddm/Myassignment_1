package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//user Ctrl+ 2  followed by L to add return type;
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Navigating to leads tab and creating a Lead;
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		//firstname,companyname,lname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Milan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dominic");
		Thread.sleep(2000);
		//email id addition
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Dominic@gmail.com");
		//description details
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Its a supply chain plant");
		WebElement geoId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select scdrp = new Select(geoId);
		scdrp.selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();	
		Thread.sleep(2000);
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("important notice: 24/7 call - 9129000000");
		driver.findElement(By.className("smallSubmit")).click();
		String editleadpage = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(editleadpage);
	}

}
