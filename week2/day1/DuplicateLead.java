package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Milan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dominic");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Dominic@gmail.com");
		WebElement geoId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select scdrp = new Select(geoId);
		scdrp.selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//clearing existing name param
        WebElement comp = driver.findElement(By.id("createLeadForm_companyName"));
        comp.getAttribute("value");
        comp.clear();
        comp.sendKeys("Mahindra SV");
		Thread.sleep(1000);
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.clear();
		fname.sendKeys("Roland Garros");
		String titlesmania = driver.getTitle();
		System.out.println(titlesmania);
	}

}
