package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium { 
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
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Navigating to leads tab and creating a Lead;
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Milan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dominic");
		//=================================================================//
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sc = new Select(dropdown);
		sc.selectByValue("LEAD_EMPLOYEE");
		sc.selectByIndex(6);
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Munawa");
		driver.findElement(By.name("departmentName")).sendKeys("Supply chain");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Its a supply chain plant");
		driver.findElement(By.name("primaryEmail")).sendKeys("Dallas@email.com");
		Thread.sleep(2000);
		WebElement sec = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sctxt = new Select(sec);
		Thread.sleep(2000);
		sctxt.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String titleofPage = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(titleofPage);
		System.out.println("PASS testcase");
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("It is important template");
		driver.findElement(By.name("submitButton"));
		Thread.sleep(2000);
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
		System.out.println("completed execution");
	}
}
