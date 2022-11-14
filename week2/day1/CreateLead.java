package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//user Ctrl+ 2  followed by L to add return type;
		//WebElement element = driver.findElement(By.id("username"));
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// Navigating to leads tab and creating a Lead;
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		Thread.sleep(2000);
		//firstname,companyname,lname
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstName']")).sendKeys("Milan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Dominic");
		Thread.sleep(2000);
		//email id addition
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Dominic@gmail.com");
		//description details
		driver.findElement(By.xpath("//textarea[@id ='createLeadForm_description']")).sendKeys("Its a supply chain plant");
		WebElement geoId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select scdrp = new Select(geoId);
		scdrp.selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value ='Create Lead']")).click();
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);	
		}
}
